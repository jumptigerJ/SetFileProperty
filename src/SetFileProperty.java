import java.io.File;

public class SetFileProperty {

	public static void main(String[] args) {
		File file = new File("test.file");
		//将文件设置为可读
		file.setReadable(false);
		//将文件设置为可写
		file.setWritable(false);
		//将文件设置为只读
		file.setReadOnly();

	}

}
