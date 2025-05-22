import java.io.File;

public class ListFile {
    public static void main(String[] args) {
        File dir = new File("nama_folder"); // ganti dengan nama folder yang diinginkan
        File[] files = dir.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    System.out.println(f.getName());
                }
            }
        }
    }
}