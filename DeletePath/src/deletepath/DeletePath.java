
package deletepath;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class DeletePath {

    /**
     * Метод, возвращающий "нормализованный" путь
     * @param in исходная строка
     * @return out "нормализованная" строка
     */
    public static String deleteWrongPath(String in){
        //Создаем лист директорий
        List <String> spl = List.of(in.split("/"));
        //создание стека на основе очереди deque
        Deque <String> stack = new ArrayDeque<>();
        
        //бежим по листу директорий
        spl.forEach((path) -> {
            if(path.equals("..")){ //если путь в родительскую директорию 
                if(stack.isEmpty() || stack.getLast().equals("..")){ //директорий выше нет
                    stack.addLast(path);
                }
                else{
                    stack.removeLast(); //поднимаем директорию
                }
            }
            else if(!path.equals(".")){ //если это не текущая директория то добавляем в конец путь
                stack.addLast(path);
            }
        });
        
        String out = "";
        out = stack.stream().map((str) -> str + "/").reduce(out, String::concat); //делаем из очереди новую строку
        out = out.substring(0, out.length()-1); //взятие строки без последнего /
        return out;
    }
    public static void main(String[] args) {
        
        //Входная строка
        String in = "КРОК/task_6_2/src/./../../task_6_1/../../../мемы/котики";
        
        System.out.println(deleteWrongPath(in));
    } 
    
}
