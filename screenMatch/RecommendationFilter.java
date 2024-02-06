public class RecommendationFilter {

    public void filters(Classifiable classifiable) {
        if (classifiable.getClassification() >= 4) {
            System.out.println("The movie is among the favorites of the moment");
        } else if (classifiable.getClassification() >= 2) {
            System.out.println("The movie is highly rated right now");
        } else {
            System.out.println("Put the movie in your list wo watch later");
        }
    }
}