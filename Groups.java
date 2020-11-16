import java.io.File;
public class FileSaveType {
    public static void main(String[] args) {
        try {
            if (args == null||args.length!=2) {
                throw new Exception("请输入路径与需要保存文件的后缀。如：C:\\Users\\Administrator\\Desktop\\img jpg");
            }
            deleteOther(args[0],args[1]);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void deleteOther(String fileName,String fileType){
        File file = new File(fileName) ;
        if(file.isDirectory()){
            File result[] = file.listFiles() ;
            if(result!=null){
                for(int x = 0 ;x<result.length ;x++){            
                    if(!result[x].getName().endsWith(fileType)){
	         System.out.println("已删除："+result[x].getName());
                        result[x].delete();        
                    }else{
	    System.out.println("保留："+result[x].getName());
	    }
                }
            }
        }
    }
}
