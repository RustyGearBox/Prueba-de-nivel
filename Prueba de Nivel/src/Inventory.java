import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Inventory <T extends Game>{

    private Map<String, T> games;

    public Inventory() {
        this.games = new HashMap<>();
    }

    public void addGame(T Game) {
        games.put(Game.getId(),Game);
    }

    public T obtainGame (String id){
        return games.get(id);
    }

    public void deleteGame(String id) throws GameDoNotExistException {
        if (!games.containsKey(id)) {
            throw new GameDoNotExistException("The game with " + id + " could not be found.");
        }
        games.remove(id);
    }

    public void updateGame(T Game) {
        games.put(Game.getId(), Game);
    }

    public Map<String, T> showGames() {
        return games;
    }

    public double obtainTotalPriceWithIVA(String id) {
        T game = games.get(id);
        if (game != null) {
            return game.priceWithIVA();
        }
        return 0;
    }

//    public List<T> filterByDificulty(Double dificulty) {
//        return games.stream()
//                .filter(j -> j.getDificulty().equalsIgnoreCase(dificulty))
//                .collect(Collectors.toList());
//    }
//
//    public List<T> filterByCategory(String category) {
//        return games.stream()
//                .filter(j -> j.getCategory().equalsIgnoreCase(category))
//                .collect(Collectors.toList());
//    }
//
//    public List<T> filterByName(String name) {
//        return games.stream()
//                .filter(j-> j.getName().equalsIgnoreCase(name))
//                .collect(Collectors.toList());
//    }
}


