import java.io.File;
class MutiMedia
{
	public static String takePhotos() throws Exception
	{
		File directory = new File("");//设定为当前文件夹 
		Runtime.getRuntime().exec("raspistill -o "+"zhangxu.jpg"+" -t 10");
		String s= directory.getAbsolutePath();
		return s+"\\zhangxu.jpg";
	}
}