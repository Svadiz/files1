import java.io.*;


public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        File games = new File("D://Games");
        if (games.mkdir()) {
            sb.append("Создана папка игры..." + "\n");
        }
        File src = new File("D://Games/src");
        if (src.mkdir()) {
            sb.append("Создана директория src..." + "\n");
        }
        File res = new File("D://Games/res");
        if (res.mkdir()) {
            sb.append("Создана директория res..." + "\n");
        }
        File savegames = new File("D://Games/savegames");
        if (savegames.mkdir()) {
            sb.append("Создана директория savegames..." + "\n");
        }
        File temp = new File("D://Games/temp");
        if (temp.mkdir()) {
            sb.append("Создана директория temp..." + "\n");
        }
        File main = new File("D://Games/src/main");
        if (main.mkdir()) {
            sb.append("Создана директория main..." + "\n");
        }
        File test = new File("D://Games/src/test");
        if (test.mkdir()) {
            sb.append("Создана директория test..." + "\n");
        }

        File Main = new File("D://Games/src/main/Main.java");
        try {
            if (Main.createNewFile()) {
                sb.append("Создан файл Main.java..." + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File Utils = new File("D://Games/src/main/Utils.java");
        try {
            if (Utils.createNewFile()) {
                sb.append("Создан файл Utils.java..." + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        File drawables = new File("D://Games/res/drawables");
        if (drawables.mkdir()) {
            sb.append("Создана директория drawables..." + "\n");
        }
        File vectors = new File("D://Games/res/vectors");
        if (vectors.mkdir()) {
            sb.append("Создана директория vectors..." + "\n");
        }
        File icons = new File("D://Games/res/icons");
        if (icons.mkdir()) {
            sb.append("Создана директория icons..." + "\n");
        }

        File tempfile = new File("D://Games/temp/temp.txt");
        try {
            if (tempfile.createNewFile()) {
                sb.append("Создан файл temp.txt..." + "\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        String txt = sb.toString();
        try (FileWriter writer = new FileWriter("D://Games/temp/temp.txt")) {
            writer.write(txt);
        } catch (IOException ex)
        {
            ex.printStackTrace();
        }


    }
}
