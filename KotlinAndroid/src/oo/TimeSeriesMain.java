package oo;

import java.util.Arrays;
import java.util.Collection;


public class TimeSeriesMain {

    public static void main(String[] args) {

        JavaTimeSeries<Person> peopleData = new JavaTimeSeries<>();
        peopleData.add(new Person());
        peopleData.add(new Student());

        Collection<Student> students = Arrays.asList(new Student(), new Student());
        peopleData.addAllCovariant(students);

        TimeSeries<Person> peopleDataKt = new TimeSeries<>();
        peopleDataKt.add(new Person());
        peopleDataKt.addAll(students);

    }
}
