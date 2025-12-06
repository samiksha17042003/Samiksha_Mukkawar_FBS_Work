#include <stdio.h>
#include <stdlib.h>
#include <string.h>

// ===============================
// Structure Definition
// ===============================
typedef struct Book {
    int id;//4
    char name[50];//50
    char author[50];//50
    char category[30];//30
    float price;//4
    float rating;//4
} Book;//size of book is 142 

// ===============================
// Function Declarations
// ===============================
void displayAll(Book *library, int count);
Book* addBook(Book *library, int *count);
Book* removeBook(Book *library, int *count);
void searchBook(Book *library, int count);
void showAuthorsBooks(Book *library, int count);
void showCategoryBooks(Book *library, int count);
void updateBookData(Book *library, int count);
void sortBooks(Book *library, int count, int byPrice);

// ===============================
// Main Function
// ===============================
int main() {
    int count = 3;

    // Hardcoded initial books
    Book temp[] = {//temp is a local array
        {101, "C Programming", "Dennis Ritchie", "Programming", 450.0, 4.5},
        {102, "Let Us C", "Yashwant Kanetkar", "Programming", 500.0, 4.7},
        {103, "Data Structures", "Narasimha Karumanchi", "DSA", 600.0, 4.6}
    };

    // Allocate memory for books
    Book *library = (Book *)malloc(count * sizeof(Book));
//copy hardcoded book into heap memory
    memcpy(library, temp, sizeof(temp));

    int choice;
    do {
        printf("\n===== Book Management System =====\n");
        printf("1. Display All Books\n");
        printf("2. Add New Book\n");
        printf("3. Remove Book\n");
        printf("4. Search Book\n");
        printf("5. Show Authors Books\n");
        printf("6. Show Categorys Books\n");
        printf("7. Update Book Data (Price/Rating)\n");
        printf("8. Sort Books by Price\n");
        printf("9. Sort Books by Rating\n");
        printf("0. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        getchar();// clears the newline character left by scanf from the input buffer so subsequent fgets calls work correctly.

        switch(choice) {
            case 1: 
            displayAll(library,count); 
            break;
            case 2: 
            library = addBook(library, &count);//because those functions can realloc the array (change pointer).
            break;
            case 3:
            library = removeBook(library, &count);
            break;
            case 4:
            searchBook(library, count);
            break;
            case 5:
            showAuthorsBooks(library, count); 
            break;
            case 6: 
            showCategoryBooks(library, count);
            break;
            case 7:
            updateBookData(library, count); 
            break;
            case 8:
            sortBooks(library, count, 1); 
            break;   // by price
            case 9:
            sortBooks(library, count, 0); 
            break;   // by rating
            case 0:
            printf("Exiting program...\nBye Bye...\n");
            break;
            default: 
            printf("Invalid choice! Try again.\n");
        }
    } while(choice != 0);

    free(library);//free heap memory
    return 0;
}

// ===============================
// Function Definitions
// ===============================

// 1. Display all books
void displayAll(Book *library, int count) {
    if (count == 0) {
        printf("\nNo books available in the library.\n");
        return;
    }

    printf("\n%-6s %-25s %-20s %-15s %-10s %-10s\n",
           "ID", "Book Name", "Author", "Category", "Price", "Rating");
    printf("--------------------------------------------------------------------------\n");
    for(int i = 0; i < count; i++) {
        printf("%-6d %-25s %-20s %-15s %-10.2f %-10.1f\n",
               library[i].id, library[i].name, library[i].author,
               library[i].category, library[i].price, library[i].rating);
    }
}

// 2. Add Book(realloc increases heap memory)
Book* addBook(Book *library, int *count) {
    (*count)++;
    library = (Book *)realloc(library, (*count) * sizeof(Book));

    printf("\nEnter Book ID: ");
    scanf("%d", &library[*count - 1].id);//fgets reads a whole line including spaces into name.
    getchar();
    printf("Enter Book Name: ");
    fgets(library[*count - 1].name, sizeof(library[*count - 1].name), stdin);
    library[*count - 1].name[strcspn(library[*count - 1].name, "\n")] = '\0';
    printf("Enter Author Name: ");
    fgets(library[*count - 1].author, sizeof(library[*count - 1].author), stdin);
    library[*count - 1].author[strcspn(library[*count - 1].author, "\n")] = '\0';
    printf("Enter Category: ");
    fgets(library[*count - 1].category, sizeof(library[*count - 1].category), stdin);
    library[*count - 1].category[strcspn(library[*count - 1].category, "\n")] = '\0';
    //strcspn(..., "\n") finds newline position; the assignment replaces trailing newline with '\0'.
    printf("Enter Price: ");
    scanf("%f", &library[*count - 1].price);
    printf("Enter Rating: ");
    scanf("%f", &library[*count - 1].rating);

    printf("Book added successfully!\n");
    return library;
}

// 3. Remove Book
Book* removeBook(Book *library, int *count) {
    int id, found = -1;
    printf("\nEnter Book ID to remove: ");
    scanf("%d", &id);

    for(int i = 0; i < *count; i++) {
        if(library[i].id == id) {
            found = i;
            break;
        }
    }

    if(found == -1) {
        printf("Book not found!\n");
        return library;
    }

    for(int i = found; i < *count - 1; i++) {//If found, shift subsequent elements left by one(overwriting the removed element).
        library[i] = library[i + 1];
    }

    (*count)--;//Decrement *count.
    library = (Book *)realloc(library, (*count) * sizeof(Book));
    //realloc to shrink memory to new size and return pointer.
    printf("Book removed successfully!\n");
    return library;
}

// 4. Search Book
void searchBook(Book *library, int count) {
    int id, choice;
    char name[50];
    printf("\nSearch by:\n1. ID\n2. Name\nEnter choice: ");
    scanf("%d", &choice); 
    getchar();

    if(choice == 1) {
        printf("Enter Book ID: ");
        scanf("%d", &id);
        for(int i = 0; i < count; i++) {
            if(library[i].id == id) {
                printf("\nFound: %s by %s | %s | Price: %.2f | Rating: %.1f\n",
                       library[i].name, library[i].author, library[i].category,
                       library[i].price, library[i].rating);
                return;
            }
        }
    } else if(choice == 2) {
        printf("Enter Book Name: ");
        fgets(name, sizeof(name), stdin);
        name[strcspn(name, "\n")] = '\0';
        for(int i = 0; i < count; i++) {
            if(stricmp(library[i].name, name) == 0) {
                printf("\nFound: %s by %s | %s | Price: %.2f | Rating: %.1f\n",
                       library[i].name, library[i].author, library[i].category,
                       library[i].price, library[i].rating);
                return;
            }
        }
    }
    printf("Book not found!\n");
}

// 5. Show Author's Books
void showAuthorsBooks(Book *library, int count) {
    char authorName[50];
    int found = 0;

    printf("\nEnter Author Name: ");
    fgets(authorName, sizeof(authorName), stdin);
    authorName[strcspn(authorName, "\n")] = '\0';

    printf("\n=== Books by %s ===\n", authorName);
    printf("%-6s %-25s %-20s %-15s %-10s %-10s\n",
           "ID", "Book Name", "Author", "Category", "Price", "Rating");
    printf("---------------------------------------------------------------------------------------------\n");

    for(int i = 0; i < count; i++) {
        if(stricmp(library[i].author, authorName) == 0) {
            printf("%-6d %-25s %-20s %-15s %-10.2f %-10.1f\n",
                   library[i].id, library[i].name, library[i].author,
                   library[i].category, library[i].price, library[i].rating);
            found = 1;
        }
    }

    if(!found)
        printf("No books found for this author.\n");
}

// 6. Show Category's Books
void showCategoryBooks(Book *library, int count) {
    char category[30];
    int found = 0;

    printf("\nEnter Category: ");
    fgets(category, sizeof(category), stdin);
    category[strcspn(category, "\n")] = '\0';

    printf("\n=== Books in %s Category ===\n", category);
    printf("%-6s %-25s %-20s %-15s %-10s %-10s\n",
           "ID", "Book Name", "Author", "Category", "Price", "Rating");
    printf("--------------------------------------------------------------------------\n");

    for(int i = 0; i < count; i++) {
        if(stricmp(library[i].category, category) == 0) {
            printf("%-6d %-25s %-20s %-15s %-10.2f %-10.1f\n",
                   library[i].id, library[i].name, library[i].author,
                   library[i].category, library[i].price, library[i].rating);
            found = 1;
        }
    }

    if(!found)
        printf("No books found in this category.\n");
}

// 7. Update Book Data
void updateBookData(Book *library, int count) {
    int id, found = 0;
    printf("\nEnter Book ID to update: ");
    scanf("%d", &id);

    for(int i = 0; i < count; i++) {
        if(library[i].id == id) {
            printf("Enter new Price: ");
            scanf("%f", &library[i].price);
            printf("Enter new Rating: ");
            scanf("%f", &library[i].rating);
            printf("Book data updated successfully!\n");
            found = 1;
            break;
        }
    }

    if(!found)
        printf("Book not found!\n");
}

// 8 & 9. Sort Books
void sortBooks(Book *library, int count, int byPrice) {
Book *sorted = (Book *)malloc(count * sizeof(Book));
    memcpy(sorted, library, count * sizeof(Book));

    Book temp;
    for(int i = 0; i < count - 1; i++) {
        for(int j = i + 1; j < count; j++) {
            int condition = byPrice ?
                (sorted[i].price > sorted[j].price) :
                (sorted[i].rating < sorted[j].rating);
            if(condition) {
                temp = sorted[i];
                sorted[i] = sorted[j];
                sorted[j] = temp;
            }
        }
    }

    printf("\n=== Books Sorted by %s ===\n", byPrice ? "Price (Ascending)" : "Rating (Descending)");
    displayAll(sorted, count);

    free(sorted); // clean up
}