package lesson13.exception.generate_exception2;

public class Example2 {

    /*
     * Создать класс с четырьмя методами checkString().
     * Метод 1 принимает в параметры строку и выбрасывает исключение, если количество символов в
     * этой строке нечетное.
     * Метод 2 принимает в параметры строку и выбрасывает исключение, если в этой строке есть
     * буквосочентани "exception".
     * Метод 3 принимает в параметры строку и выбрасывает исключение, если эта строка состоит из количества слов меньше 3.
     * Метод 4 внутри себя вызывает предыдущие три метода.
     *
     * Все исключения создать отдельными собственными классами.
     * */

    public class NechetLenthException extends Exception {
        public NechetLenthException(String message) {
            super(message);
        }
    }

    public class ContainsWordException extends Exception {
        public ContainsWordException(String message) {
            super(message);
        }
    }

    public class CountOfWordException extends Exception {
        public CountOfWordException(String message) {
            super(message);
        }
    }

    private void checkString1(String s) throws NechetLenthException {
        if (s.length() % 2 != 0){
            throw new NechetLenthException("The count of chars from this String is nechet!!!");
        }
    }

    private void checkString2(String s) throws ContainsWordException {
        if(s.contains("exception")){
            throw new ContainsWordException("This String contains \"exception\"!!!");
        }
    }

    private void checkString3(String s) throws CountOfWordException {
        if(s.split("\\s").length < 3) {
            throw new CountOfWordException("The count of word less than 3!!!");
        }
    }

    public void checkString4(String s) throws ContainsWordException, NechetLenthException, CountOfWordException {
        checkString1(s);
        checkString2(s);
        checkString3(s);
    }

}
