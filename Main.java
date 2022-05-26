import java.io.*;


public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String[] listFolders = {"D://Games/src", "D://Games/res", "D://Games/savegames", "D://Games/temp",
                "D://Games/res/drawables", "D://Games/res/drawables", "D://Games/res/drawables",
                "D://Games/src/main", "D://Games/src/main", "D://Games/src",};
        String[] listFiles = {"D://Games/src/main/main.java", "D://Games/src/main/utils.java", "D://Games/temp/temp.txt"};

        File src = new File("D://Games");
        if (src.mkdir()) {
            sb.append("Создана папка игры" + "\n");
        }

        for (String s : listFolders) {
            File folder = new File(s);
            if (folder.mkdir()) {
                sb.append("Создана директория " + s + "\n");
            }
        }

        for (String s : listFiles) {
            File Main = new File(s);
            try {
                if (Main.createNewFile()) {
                    sb.append("Создан файл " + s + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        String txt = sb.toString();
        try (FileWriter writer = new FileWriter("D://Games/temp/temp.txt")) {
            writer.write(txt);
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
