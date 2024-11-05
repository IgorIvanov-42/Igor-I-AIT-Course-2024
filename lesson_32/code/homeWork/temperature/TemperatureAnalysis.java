package homeWork.temperature;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class DayTemperature {
        private LocalDate date;
        private double temperature;

        public DayTemperature(LocalDate date, double temperature) {
            this.date = date;
            this.temperature = temperature;
        }

        public LocalDate getDate() {
            return date;
        }

        public double getTemperature() {
            return temperature;
        }

        @Override
        public String toString() {
            return "Date: " + date + ", Temperature: " + temperature;
        }
    }

    public class TemperatureAnalysis {
        public static void main(String[] args) {
            // Создаем два списка для хранения данных о температуре за две недели
            List<DayTemperature> lastWeekOfOctober = new ArrayList<>();
            List<DayTemperature> firstWeekOfNovember = new ArrayList<>();

            // Пример данных для последней недели октября
            lastWeekOfOctober.add(new DayTemperature(LocalDate.of(2023, 10, 25), 10.5));
            lastWeekOfOctober.add(new DayTemperature(LocalDate.of(2023, 10, 26), 12.3));
            lastWeekOfOctober.add(new DayTemperature(LocalDate.of(2023, 10, 27), 11.8));
            lastWeekOfOctober.add(new DayTemperature(LocalDate.of(2023, 10, 28), 9.0));
            lastWeekOfOctober.add(new DayTemperature(LocalDate.of(2023, 10, 29), 8.7));
            lastWeekOfOctober.add(new DayTemperature(LocalDate.of(2023, 10, 30), 10.0));
            lastWeekOfOctober.add(new DayTemperature(LocalDate.of(2023, 10, 31), 9.5));

            // Пример данных для первой недели ноября
            firstWeekOfNovember.add(new DayTemperature(LocalDate.of(2023, 11, 1), 8.8));
            firstWeekOfNovember.add(new DayTemperature(LocalDate.of(2023, 11, 2), 7.4));
            firstWeekOfNovember.add(new DayTemperature(LocalDate.of(2023, 11, 3), 10.1));
            firstWeekOfNovember.add(new DayTemperature(LocalDate.of(2023, 11, 4), 9.9));
            firstWeekOfNovember.add(new DayTemperature(LocalDate.of(2023, 11, 5), 8.5));
            firstWeekOfNovember.add(new DayTemperature(LocalDate.of(2023, 11, 6), 7.9));
            firstWeekOfNovember.add(new DayTemperature(LocalDate.of(2023, 11, 7), 8.2));

            // Объединяем данные из двух списков
            List<DayTemperature> twoWeeks = new ArrayList<>(lastWeekOfOctober);
            twoWeeks.addAll(firstWeekOfNovember);

            // Рассчитываем среднюю температуру за две недели
            double averageTemperature = twoWeeks.stream()
                    .mapToDouble(DayTemperature::getTemperature)
                    .average()
                    .orElse(Double.NaN);
            System.out.println("Средняя температура за две недели: " + averageTemperature);

            // Находим день с минимальной температурой
            DayTemperature minTemperatureDay = twoWeeks.stream()
                    .min(Comparator.comparingDouble(DayTemperature::getTemperature))
                    .orElse(null);
            System.out.println("Минимальная температура: " + minTemperatureDay);

            // Находим день с максимальной температурой
            DayTemperature maxTemperatureDay = twoWeeks.stream()
                    .max(Comparator.comparingDouble(DayTemperature::getTemperature))
                    .orElse(null);
            System.out.println("Максимальная температура: " + maxTemperatureDay);
        }
    }


