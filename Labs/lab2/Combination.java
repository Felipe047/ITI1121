public class Combination {
    int first, second, third;

    public Combination(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public boolean equals(Combination other) {
        return !(this.first != other.first || this.second != other.second || this.third != other.third);
    }

    public String toString() {
        return this.first + ":" + this.second + ":" + this.third;
    }
}
