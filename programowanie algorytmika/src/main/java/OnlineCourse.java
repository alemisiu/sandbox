public class OnlineCourse extends Course{
    private int videoLengthMin;
    private int timeToFinish;

    public int getVideoLengthMin(){
        return videoLengthMin;
    }
    public void setVideoLengthMin(int videoLengthMin) {
        this.videoLengthMin = videoLengthMin;
    }
    public int getTimeToFinish(){
        return timeToFinish;
    }
    public void setTimeToFinish(int timeToFinish){
        this.timeToFinish = timeToFinish;
    }
}
