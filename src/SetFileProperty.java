import java.io.File;

public class SetFileProperty {

	public static void main(String[] args) {
		File file = new File("test.file");
		//���ļ�����Ϊ�ɶ�
		file.setReadable(false);
		//���ļ�����Ϊ��д
		file.setWritable(false);
		//���ļ�����Ϊֻ��
		file.setReadOnly();

	}

}
