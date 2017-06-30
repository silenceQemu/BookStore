import java.util.Arrays;

public class HelloWorld {
    //完成 main 方法
    public static void main(String[] args) {
		// 创建一个空的StringBuilder对象
		
        StringBuilder str = new StringBuilder();
		// 追加字符串
		str.append("jaewkjldfxmopzdm");
		
        // 从后往前每隔三位插入逗号
        int i = str.length()-3;
		do{
		    str.insert(i,";");
		    i-=3;
		}while(i>=0);
        // 将StringBuilder对象转换为String对象并输出
		System.out.print(str.toString());
    }
    
    //定义方法完成成绩排序并输出前三名的功能
}
