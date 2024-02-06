public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.setName("The Godfather");
        myMovie.setReleaseYear(1970);
        myMovie.setDurationInMinutes(180);
        System.out.println("Movie duration: " + myMovie.getDurationInMinutes());

        myMovie.displaysTechnicalSheet();
        myMovie.evaluates(8);
        myMovie.evaluates(5);
        myMovie.evaluates(10);

        System.out.println("Total assesments: " + myMovie.getTotalAssessments());
        System.out.println(myMovie.Average());

        Series lost = new Series();
        lost.setName("Lost");
        lost.setReleaseYear(2004);
        lost.displaysTechnicalSheet();
        lost.setSeasons(6);
        lost.setEpisodesPerSeason(10);
        lost.setMinutesPerEpisode(50);
        System.out.println("Duration to marathon Lost: " + lost.getDurationInMinutes());

        Movie otherMovie = new Movie();
        otherMovie.setName("Avatar");
        otherMovie.setReleaseYear(2023);
        otherMovie.setDurationInMinutes(200);
        System.out.println("Movie duration: " + otherMovie.getDurationInMinutes());

        TimeCalculator calculator = new TimeCalculator();
        calculator.includes(myMovie);
        calculator.includes(otherMovie);
        calculator.includes(lost);
        System.out.println(calculator.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.filters(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSeries(lost);
        episode.setTotalViews(300);
        filter.filters(episode);

    }
}