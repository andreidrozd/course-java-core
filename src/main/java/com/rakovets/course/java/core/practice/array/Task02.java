package com.rakovets.course.java.core.practice.array;

/**
 * Разработать программу для электронного дневника, которая работает с отметками по всем предметам.
 *
 * @author Dmitry Rakovets
 */
class Task02 {
    public static void main(String[] args) {
        //FIXME
        // Ниже приведены значения присваиваемые переменным. Их можно изменять для проверки различных вариантов входных
        // аргументов. Типы данных изменять нельзя
        int[][] marks = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double averageMark = getAverageMark(marks);
        System.out.printf("Average mark: %f\n", averageMark);
        int minMark = getMinMark(marks);
        System.out.printf("Min mark: %d\n", minMark);
        int maxMark = getMaxMark(marks);
        System.out.printf("Max mark: %d\n", maxMark);
    }

    /**
     * Возвращает средне арифметическую отметку за весь период обучения с округлением до 2 знаков.
     *
     * @param marks отметки
     * @return средняя арифметическая отметка
     */
    static double getAverageMark(int[][] marks) {
        double sum = 0;
        for (int[] mark : marks) {
            for (int j = 0; j < marks[0].length; j++) {
                sum += mark[j];
            }
        }
        return sum / (marks.length * marks[0].length);
    }

    /**
     * Возвращает минимальную отметку за весь период обучения.
     *
     * @param marks отметки
     * @return минимальная отметка
     */
    static int getMinMark(int[][] marks) {
        int min = marks[0][0];
        for (int[] mark : marks) {
            for (int j = 0; j < marks[0].length; j++) {
                if (min > mark[j]) {
                    min = mark[j];
                }
            }
        }
        return min;
    }

    /**
     * Возвращает максимальную отметку за весь период обучения.
     *
     * @param marks отметки
     * @return максимальная отметка
     */
    static int getMaxMark(int[][] marks) {
        int max = marks[0][0];
        for (int[] mark : marks) {
            for (int j = 0; j < marks[0].length; j++) {
                if (max < mark[j]) {
                    max = mark[j];
                }
            }
        }
        return max;
    }
}
