package lesson_6.socketexamples;

//задача клиента отправить строку на сервер и ожидать ответа обратно (делаем простенько из консоли ввод)
/*public class ClientApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//указываем поток из которого сканер будет получать (наша консолька)

        try (Socket socket = new Socket("localhost", 2222)) {//открываем трубочку ( сокет) до сервера
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream()); //привязываем к сокету поток data
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());// к выходу привязываем ( на примере показано как можно брать из сокета и отправл

                while (true) {//клиент должен слушать что пришло от сервера и отправлять обратно
                    System.out.println("введите что хотели сказать: ");//пригласить пользователя ввести (сказать что пора)
                //считать что сказал пользователь с помощью сканера
                    String request = scanner.nextLine();//что бы не перечитывать сохраняем в некую стрингу

                   dataOutputStream.writeUTF(request); // и отправить на сервер

                    if(request.equals("end")) break;//для выхода из бесконечного цикла делаем брейк (если енд то не ожидаем больше ответ от сервера)
                    System.out.println("получили ответ от сервера" + dataInputStream.readUTF());// получаем ответ и вывести пользователю

                }

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}*/