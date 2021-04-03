package Java3.Lesson3.InputOutputFile;

import java.io.*;

public class HomeWork {

    //Создаём класс на стороне клиента
    public class ExternalFileHandler {
        private File chatLogFile;

        //Создадим файл в обработчике файлов
        public ExternalFileHandler(String username) {
            //создаём экземпляр chatLogFile с именем юзера
            chatLogFile = new File(username + "Log.txt");
            if (!chatLogFile.exists()) {
                try {
                    chatLogFile.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        //Создаём метод для записи сообщения в файл.
        public void writeInLog(String message) {
            try (OutputStreamWriter writeIn = new OutputStreamWriter(new BufferedOutputStream(new FileOutputStream(chatLogFile, true)), "UTF-8")) {
                writeIn.write(message + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //На стороне клиента после авторизации создаём файл с именем пользователя
    ExternalFileHandler log = new ExternalFileHandler(username);

    // Цикл общения
    while (true) {
        String msg = in.readUTF();
        if (msg.startsWith("/")) {
            if (msg.startsWith("/clients_list ")) {
                // /clients_list Bob Max Jack
                String[] tokens = msg.split("\\s");
                Platform.runLater(() -> {
                    clientsList.getItems().clear();
                    for (int i = 1; i < tokens.length; i++) {
                        clientsList.getItems().add(tokens[i]);
                    }
                });
            }
            continue;
        }
        msgArea.appendText(msg + "\n");
        
        //записываем в файл Лог с msgArea
        log.writeInLog(msg);
    }

}

