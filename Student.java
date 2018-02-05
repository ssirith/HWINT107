public class Student {
    private String name;
    private double weight;
    private double height;

    public Student() {
    }

    public Student(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        double sum = weight;
        if (weight < 0) {
            sum = -1;
        } else if (height == 0) {
            sum = -2;
        }
        return sum;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        double sum = height;
        if (height < 0) {
            sum = -1;
        } else if (height == 0) {
            sum = -2;
        }
        return sum;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBMI() {
        double sum = 0;
        sum = weight / (height* height);
        return sum;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", weight=" + weight + ", height=" + height + '}' + getBMI();
    }
    
    

}
