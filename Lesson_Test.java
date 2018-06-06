package ru.foxit.grayfox;

/**
 * Author Lesson_Test.java - GrayFox | Ilya Lisin
 * Contact: Skype: foxygameskype | Telegram: +7(925)316-65-82 | vk: https://vk.com/exsperto1
 * GitHub: https://github.com/FoxITeam and https://github.com/GrayFoxIT
 * encoding: UTF-8, Comments, remarks in Russian.
 */

/**
 * Важные заметки, которые очень пригодятся на следующих занятиях.
 * <p>
 * + что мы повторили или используем в коде
 * - то что мы не повторяли или не приходилось использовать в коде
 * o - то что мы узнали на этом уроке и нужно повторить на следующем.
 * ++ todo | ctrl + F2 - остановить проект.
 * ++ todo | fori - сокращение цикла for обычная, itar - сокрашения цикла for с массивом, iter - еще не изучали, хотя не пизжу, забыл =D
 * Примечание: fori sout psvm itar и подобные сокращения работают только в методах.
 * ++ todo | с помощью жука (дебагера) кликаем по нужному участку кода, запускаем и шагаем F8 по шагам, смотрим на выполнение кода.
 * ++ todo | alt + Enter (Наводим на if или switch и мы можем переконвертировать их) с if в switch или наоборот.
 * ++ todo | CTRL + / - комментирования выделенных строк в коде.
 * ++ todo | Название переменных и методов начинаются с маленькой буквой, в то время как классы начинаются с большой буквы.
 * -+ todo | CTRL + F - поиск, CTRL + R - замена слова.
 * +- todo | CTRL + SHIFT + ENTER - поставить точку с запятой и перейти на следующую строку.
 * ++ todo | CTRL + D - копировать ту строку, на которую мы нажали и оно вставит ее ниже.
 * ++ todo | Зажимаем ALT и выделяем, выделять будет квадратом.
 * ++ todo | Shift + F10 - запустить проект.
 * ++ todo | Shift + F6 - переименования название методов/переменных.
 * ++ todo | psvm - public static void Main
 * ++ todo | sout - System.out.println
 * ++ todo | Alt+ctrl+L - форматирование текста и кода в IDEA, удобная вещь.
 * ++ todo | Alt + Insert = Можно сгенерировать геттеры и сеттеры.
 * ++ todo | Что такое переменная - по факту это ссылка в адрес памяти и что по этому адресу лежит
 * ++ todo | определяется типом нашей переменной. Типы переменных бывают 2 видов - это
 * ++ todo | примитивные и ссылочные, их всего восемь.
 * ++ todo | Что такое метод - метод, он же в некоторых языках функция, это какое то поведение
 * ++ todo | если класс это описание объекта, допустим машина, то метод это его поведение, то что эта
 * ++ todo | машина может делать, например сигналить.
 * ++ todo | Что такое String в Java? Какой это тип данных?
 * ++ todo | String – это класс в Java, который прописан в пакете java.lang. Это не примитивный тип данных,
 * ++ todo | как int и long. Класс String представляет строковый набор символов.
 * ++ todo | Везде, где мы делаем константную проверку, используем свитч, это экономит ресурсы. if проверяет все, а вот свитч
 * ++ todo | остановиться на нужном условии и выйдет из блока кода, не станет дальше проверять, в отличии от if.
 * ++ todo | Рефакторинг это улучшение кода, когда вы его написали, код который работает, но скорее всего вы его с первого раза не написали
 * ++ todo | его идеально, нам нужно его обработать, обработка напильников, полировка, шлифовка, шпаклей херовка, цементировка, синонимыСловафрафаф тфу...
 * + todo | Случайные значения получаются с помощью класса рандом!
 * + todo | В джава всЁ объекты, кроме примитивных типов. Примитивные типы не объекты, но у них есть оболочки!
 * + todo | Одномерный массив это список, многомерный массив это таблица (матрица).
 * + todo | Полиморфизм - работа с несколькими типами, но в то же время у каждого типа будет свое уник. поведение.
 * + todo | Инкапсуляция - принцип обертывания данных (переменных) и кода в единое целое, создано для безопасности.
 * + todo | Пример инкапсуляции может быть геттеры и сеттеры.
 * + todo | Абстракции это процесс сокрытия деталей от пользователей, только функционал будет доступен пользователю.
 * + todo | ctrl + Alt + M - Прежде выделяем область и комбинацию. Она может выделенный фрагмент кода экстрактить в отдельный элемент кода.
 * + todo | * Некоторый код требует чтобы его писали в блоке кода трай кетч \ Безопасным считается код, который проверяется на наличие исключений (ошибок).
 * + todo | * Не безопасным считается код, который не проверяетмя, но может бросить исключения (ошибки).
 * + todo | * не безопасный код нужно писать Try catch, - попробовать try сделать что либо, если это не получиться
 * + todo | * catch - перехватить вылетевший экзепшен.
 * + todo | // Что такое форматированный ввод: Один из вариантов форматированного ввода в джаве
 * + todo | // Класс MessageFormat и его статический метод format позволяет подставлять аргументы
 * + todo | // переданные в данный метод. Данный метод формат уже принимает 2 аргумента (строку Pattern и имя str)
 * + todo | // Pattern = шаблон, это шаблон проектирования или паттер проектирования.
 * + todo | \\ Для того, чтобы обратиться к методу другого класса, нужно написать класс точка и название метода.
 * + todo | \\ Если этот метод не статический, то нужно создать экземпляр класса "new", если же он статический, то
 * + todo | \\ к нему достаточно обратиться через точку.
 * + todo | // В предыдущем прохождении джавы я не раздечал deepToString и toString = deepToString пишется когда 2 мерный массив,
 * + todo | // а toString пишется, когда одномерный массив!
 */

public class Lesson_Test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printIDArray(array);
    }

    // Для того, чтобы обратиться к методу другого класса, нужно написать класс точка и название метода.
    // Если этот метод не статический, то нужно создать экземпляр класса "new", если же он статический, то
    // к нему достаточно обратиться через точку.
    public static void printIDArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    // Метод внутри метода нельзя, за то метод внутри класс, внутри класса метод и так далее можно!
    // Правда страдает область видимости... не знаю для чего такое пригодиться, но я думаю, что
    // когда нибудь я с этим столкнусь!
    public static void method() {
        class Lesson_Test2 {
            public void test() {
                class Lesson_Test3 {
                    public void testTwo(){
                        System.out.println(" ");
                    }
                }
            }
        }
    }
}

