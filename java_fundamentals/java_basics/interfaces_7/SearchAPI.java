package java_fundamentals.java_basics.interfaces_7;

import java.util.ArrayList;
import java.util.List;

// Interface defining the search functionality
interface Searchable {
    List<String> search(String query);
}

// Class implementing the search functionality for a file system
class FileSystemSearch implements Searchable {
    @Override
    public List<String> search(String query) {
        // Simulated search operation in the file system
        List<String> results = new ArrayList<>();
        // Assuming searching logic here
        results.add("File1.txt");
        results.add("File2.txt");
        results.add("Folder1/File3.txt");
        return results;
    }
}

// Class implementing the search functionality for a database
class DatabaseSearch implements Searchable {
    @Override
    public List<String> search(String query) {
        // Simulated search operation in the database
        List<String> results = new ArrayList<>();
        // Assuming database query execution here
        results.add("Record1");
        results.add("Record2");
        return results;
    }
}

// API class providing search functionality for various sources
public class SearchAPI {
    private Searchable searchable;

    // Constructor to set the search source
    public SearchAPI(Searchable searchable) {
        this.searchable = searchable;
    }

    // Method to perform search
    public List<String> performSearch(String query) {
        return searchable.search(query);
    }

    public static void main(String[] args) {
        // Example usage of the API with FileSystemSearch
        Searchable fileSystemSearch = new FileSystemSearch();
        SearchAPI fileSystemAPI = new SearchAPI(fileSystemSearch);
        List<String> fileSystemResults = fileSystemAPI.performSearch("java");
        System.out.println("File System Search Results:");
        for (String result : fileSystemResults) {
            System.out.println(result);
        }

        System.out.println();

        // Example usage of the API with DatabaseSearch
        Searchable databaseSearch = new DatabaseSearch();
        SearchAPI databaseAPI = new SearchAPI(databaseSearch);
        List<String> databaseResults = databaseAPI.performSearch("java");
        System.out.println("Database Search Results:");
        for (String result : databaseResults) {
            System.out.println(result);
        }
    }
}

