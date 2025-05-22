import java.io.File;

public class Hapus {
    public static void main(String[] args) {
        File dir = new File("nama_folder"); // ganti dengan nama folder yang dihapus
        File[] files = dir.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    f.delete();
                }
            }
        }
        dir.delete();
        System.out.println("Direktori dan semua file di dalamnya telah dihapus.");
    }
}