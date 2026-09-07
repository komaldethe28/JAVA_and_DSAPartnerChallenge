/*
Q22: Convert Seconds → Hours
Story
Convert total seconds into hours (ignore minutes/seconds).
*/

class SecondToHours {
    public static void main(String[] args) {
        int totalSeconds=7200;
        double totalHours=totalSeconds/(60*60);
        System.out.println("Total Hours :"+totalHours);
    }
}