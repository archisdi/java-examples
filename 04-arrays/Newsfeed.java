import java.util.Arrays;

public class Newsfeed {

    String[] topics;
    String[] favoriteArticles;
    int[] views = { 0, 0, 0, 0 };

    public Newsfeed(String[] initialTopics) {
        topics = initialTopics;
    }

    public void setFavoriteArticle(int favoriteIndex, String newArticle) {
        // Add newArticle to favoriteArticles:
        favoriteArticles[favoriteIndex] = newArticle;
    }

    public String[] getTopics() {
        return topics;
    }

    public String getTopTopic() {
        return topics[0];
    }

    public void viewTopic(int topicIndex) {
        // System.out.println(topics[topicIndex]);
        views[topicIndex] += 1;
    }

    public static void main(String[] args) {
        Newsfeed feed;
        if (args[0].equals("Human")) {

            // topics for a Human feed:
            String[] humanTopics = { "Politics", "Science", "Sports", "Love" };
            feed = new Newsfeed(humanTopics);

        } else if (args[0].equals("Robot")) {

            // topics for a Robot feed:
            String[] robotTopics = { "Oil", "Parts", "Algorithms", "Love" };
            feed = new Newsfeed(robotTopics);

        } else {
            String[] genericTopics = { "Opinion", "Tech", "Science", "Health" };
            feed = new Newsfeed(genericTopics);
        }

        System.out.println("The topics in this feed are:");
        System.out.println(Arrays.toString(feed.topics));
    }
}
