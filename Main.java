import java.io.*;


public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String[] listGames = {"src", "res", "savegames", "temp"};
        String[] listRes = {"drawables", "icons", "vectors"};
        String[] listSrc = {"main", "test"};
        String[] listMain = {"main.java", "utils.java"};

        File src = new File("D://Games");
        if (src.mkdir()) {
            sb.append("Создана папка игры" + "\n");
        }

        for (String s : listGames) {
            File folder = new File("D://Games/" + s);
            if (folder.mkdir()) {
                sb.append("Создана директория " + s + "\n");
            }
        }

        for (String s : listRes) {
            File folder = new File("D://Games/res/" + s);
            if (folder.mkdir()) {
                sb.append("Создана директория " + s + "\n");
            }
        }

        for (String s : listSrc) {
            File folder = new File("D://Games/src/" + s);
            if (folder.mkdir()) {
                sb.append("Создана директория " + s + "\n");
            }
        }

        for (String s : listMain) {
            File Main = new File("D://Games/src/main/" + s);
            try {
                if (Main.createNewFile()) {
                    sb.append("Создан файл " + s + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        File tempfile = new File("D://Games/temp/temp.txt");
        try {
            if (tempfile.createNewFile()) {
                sb.append("Создан файл temp.txt" + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String txt = sb.toString();
        try (FileWriter writer = new FileWriter("D://Games/temp/temp.txt")) {
            writer.write(txt);
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
