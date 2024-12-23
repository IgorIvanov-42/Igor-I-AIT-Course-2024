package homeWork;
// Дано предложение: "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового,
// ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками,
// ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время,
// – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете,
// брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и
// верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали
// сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись
// восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним
// отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно
// и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела
// выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских
// лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К.
// был съезд помещиков, и кончались дворянские выборы.";
// - Напишите метод, который отвечает на вопрос сколько слов в этом предложении. Обратите внимание, что тире
// не является словом. Подсчитайте, сколько букв (не символов!) в этом предложении.

public class HomeWork_15_03 {
    public static void main(String[] args) {
        String sentence = "В 1800-х годах, в те времена, когда не было еще ни железных, ни шоссейных дорог, ни газового, ни стеаринового света, ни пружинных низких диванов, ни мебели без лаку, ни разочарованных юношей со стеклышками, ни либеральных философов-женщин, ни милых дам-камелий, которых так много развелось в наше время, – в те наивные времена, когда из Москвы, выезжая в Петербург в повозке или карете, брали с собой целую кухню домашнего приготовления, ехали восемь суток по мягкой, пыльной или грязной дороге и верили в пожарские котлеты, в валдайские колокольчики и бублики, – когда в длинные осенние вечера нагорали сальные свечи, освещая семейные кружки из двадцати и тридцати человек, на балах в канделябры вставлялись восковые и спермацетовые свечи, когда мебель ставили симметрично, когда наши отцы были еще молоды не одним отсутствием морщин и седых волос, а стрелялись за женщин и из другого угла комнаты бросались поднимать нечаянно и не нечаянно уроненные платочки, наши матери носили коротенькие талии и огромные рукава и решали семейные дела выниманием билетиков, когда прелестные дамы-камелии прятались от дневного света, – в наивные времена масонских лож, мартинистов, тугендбунда, во времена Милорадовичей, Давыдовых, Пушкиных, – в губернском городе К. был съезд помещиков, и кончались дворянские выборы.";

        // Вызов метода для подсчета слов и букв:
        countWordsAndLetters(sentence);

    } // end of main

    public static void countWordsAndLetters (String text){

        int letterCount = 0;
        int wordCount = 0;
        boolean inWord = false;                                     // Флаг для отслеживания нахождения внутри слова

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);                                // Получаем символ по индексу

            // Увеличиваем счетчик букв, если символ - это буква:
            if (Character.isLetter(c)){
                letterCount++;                                     // Увеличиваем счетчик букв
                inWord = true;                                     // Мы внутри слова
            }else{
                // Если мы вышли из слова и встретили пробел или тире:
                if(inWord){
                    wordCount++;                                  // Увеличиваем счетчик слов
                    inWord = false;                               // Сбрасываем флаг
                }
            }
        } // end of for

        // Выводим результаты:
        System.out.println("Количество букв: " + letterCount);
        System.out.println("Количество слов: " + wordCount);
    } // end of method
} // end of class

