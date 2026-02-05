package desafio.itau.DTO;

public class EstatisticasReponse {
    
    private long count;
    private double sum;
    private double avg;
    private double max;
    private double min;

    public EstatisticasReponse(long count, double sum, double avg, double max, double min) {
        this.count = count;
        this.sum = sum;
        this.avg = avg;
        this.max = max;
        this.min = min;
    }
    public long getCount() {
        return count;
    }
    public double getSum() {
        return sum;
    }
    public double getAvg() {
        return avg;
    }
    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

}
