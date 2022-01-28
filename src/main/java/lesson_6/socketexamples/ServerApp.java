package lesson_6.socketexamples;

//вариант когда сервет получает строчку и отправляет ее обратно (простенький сервер)
/*public class ServerApp {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(2222)) {  //сокет из сервера (обозначается виртуальный порт цифрами)
            System.out.println("Server Work! ожидает соединения");

            Socket socket = serverSocket.accept();//чтобы достроить соединение открываем просто сокет
            System.out.println("клиент подключился");//сообщаем что соединение состоялось

            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream()); //привязываем к сокету поток data
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());// к выходу привязываем ( на примере показано как можно брать из сокета и отправлять)

            while (true) {//теперь отправляем строку туда и обратно (от клиента на сервер и обратно), делаем это бесконечным циклом
                String clientRequest_1 = dataInputStream.readUTF();// сохраним ее в отдельную переменную то что сумели достать из отдельного потока(readUTF- договор о строчках)
                 if(clientRequest_1.equals("end")) break;//придумываем значек по которому будем выходить (енд) ... строки сравниваем не на ровно а на эквалс
                System.out.println("получили строчку : " + clientRequest_1); //контроль сервера что получили

                dataOutputStream.writeUTF("отвечаем на месендж :" + clientRequest_1);//обратно отдать , что бы было понятно на стророне клиента отправил ли он строку
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
*/