import java.util.Arrays;

public class HelloWorld {
    //��� main ����
    public static void main(String[] args) {
		// ����һ���յ�StringBuilder����
		
        StringBuilder str = new StringBuilder();
		// ׷���ַ���
		str.append("jaewkjldfxmopzdm");
		
        // �Ӻ���ǰÿ����λ���붺��
        int i = str.length()-3;
		do{
		    str.insert(i,";");
		    i-=3;
		}while(i>=0);
        // ��StringBuilder����ת��ΪString�������
		System.out.print(str.toString());
    }
    
    //���巽����ɳɼ��������ǰ�����Ĺ���
}
