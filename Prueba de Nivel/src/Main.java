
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Inventory<Game> inventory = new Inventory<>();

    public static void main(String[] args) {

        while(true) {
            System.out.println("\nOptions menu:");
            System.out.println("1. Create game");
            System.out.println("2. Update quantity stock of a game");
            System.out.println("3. Show all games, with price + IVA ");
            System.out.println("4. Search game by name");
            System.out.println("5. Delete game by id");
            System.out.println("6. Filter game by dificulty");
            System.out.println("7. Filter game by category");
            System.out.println("0. exit\n");

            System.out.print("Which option do you want to do: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    createGame(); // Works
                    break;
                case 2:
                    updateGameStock(); // Works
                    break;
                case 3:
                    showGames(); // Problem method "showGames"
                    break;
                case 4:
                    findGamebyName(); // Problem with .Steam in Inventory.class
                    break;
                case 5:
                    deleteGame(); // Works
                    break;
                case 6:
                    filterByDificulty(); // Problem with .Steam in Inventory.class
                    break;
                case 7:
                    filterByCategory(); // Problem with .Steam in Inventory.class
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void createGame() {

        scanner.nextLine();

        System.out.print("Insert the game ID: ");
        String id = scanner.nextLine();
        System.out.print("Insert the game NAME: ");
        String name = scanner.nextLine();
        System.out.print("Insert the game CATEGORY: ");
        String category = scanner.nextLine();
        System.out.print("Insert the game QUANTITY: ");
        double quantity = scanner.nextDouble();
        System.out.print("Insert the game PRICE: ");
        double price = scanner.nextDouble();
        System.out.print("Insert the game DIFICULTY: ");
        double dificulty = scanner.nextDouble();

        Game newGame = new StategyGame(id, name, category, quantity, price, dificulty);

        inventory.addGame(newGame);
        System.out.println("The game " + name + ", has been successfully added");

    }

    private static void updateGameStock() {
        scanner.nextLine();

        System.out.print("Which game stock do you want to update (ID)?");
        String id = scanner.nextLine();

        System.out.print("\nInsert the quantity:");
        double quantity = scanner.nextDouble();

        Game game = inventory.obtainGame(id);

        if (game != null) {
            game.updateQuantity(quantity);
            System.out.println("The quantity has been updated successfully");
        } else {
            System.out.println("The quantity could not be updated");
        }

    }

    private static void showGames() {
//        List<Game> games = inventory.showGames();
//        if (games.isEmpty()) {
//            System.out.println("There are no games in the inventory");
//        } else {
//            games.forEach(game -> {
//                System.out.println("ID: " + game.getId());
//                System.out.println("Name: " + game.getName());
//                System.out.println("Category: " + game.getCategory());
//                System.out.println("Dificulty: " + game.getDificulty());
//                System.out.println("Price + IVA: " + game.priceWithIVA());
//                System.out.println("Quantity: " + game.getQuantity());
//                System.out.println("\n ");
//            });
//        }
    }

    private static void findGamebyName() {
//        scanner.nextLine();
//
//        System.out.print("Insert the name of the game: ");
//        String name = scanner.nextLine();
//
//        List<Game> gamesFound = inventory.filterByName(name);
//        if (gamesFound.isEmpty()) {
//            System.out.println("There are no games with that name");
//        } else {
//            gamesFound.forEach(game -> {
//                System.out.println("ID: " + game.getId());
//                System.out.println("Name: " + game.getName());
//                System.out.println("Category: " + game.getCategory());
//                System.out.println("Dificulty: " + game.getDificulty());
//                System.out.println("Price + IVA: " + game.priceWithIVA());
//                System.out.println("Quantity: " + game.getQuantity());
//                System.out.println("\n ");
//            });
//        }
    }

    private static void deleteGame() {
        scanner.nextLine();

        System.out.print("Insert the id of the game you want to delete: ");
        String id = scanner.nextLine();

        try {
            inventory.deleteGame(id);
            System.out.println("The game has been successfully deleted");
        } catch (GameDoNotExistException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    private static void filterByDificulty() {
//        scanner.nextLine();
//
//        System.out.print("Insert the category of the game: ");
//        Double dificulty = scanner.nextDouble();
//
//        List<Game> filteredGames = inventory.filterByDificulty(dificulty);
//        if (filteredGames.isEmpty()) {
//            System.out.println("There weren't any game with that dificulty");
//        } else {
//            filteredGames.forEach(game -> {
//                System.out.println("ID: " + game.getId());
//                System.out.println("Name: " + game.getName());
//                System.out.println("Category: " + game.getCategory());
//                System.out.println("Dificulty: " + game.getDificulty());
//                System.out.println("Price + IVA: " + game.priceWithIVA());
//                System.out.println("Quantity: " + game.getQuantity());
//                System.out.println("\n ");
//            });
//        }
    }

    private static void filterByCategory() {
//        scanner.nextLine();
//
//        System.out.print("Insert the category of the game: ");
//        String category = scanner.nextLine();
//
//        List<Game> filteredGames = inventory.filterByCategory(category);
//        if (filteredGames.isEmpty()) {
//            System.out.println("There weren't any game with that category");
//        } else {
//            filteredGames.forEach(game -> {
//                System.out.println("ID: " + game.getId());
//                System.out.println("Name: " + game.getName());
//                System.out.println("Category: " + game.getCategory());
//                System.out.println("Dificulty: " + game.getDificulty());
//                System.out.println("Price + IVA: " + game.priceWithIVA());
//                System.out.println("Quantity: " + game.getQuantity());
//                System.out.println("\n ");
//            });
//        }
    }

}