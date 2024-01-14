public interface OpticalDisc {
    void spin();
    void storeData();
    void writeDataWithLaser();
    void readDataWithLaser();
    void reportInformation();
    void ejectDisc();
    void startPlaying();
    void stopPlaying();
}
