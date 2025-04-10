package seedu.fintrack.command;

import seedu.fintrack.ExpenseList;
import seedu.fintrack.utils.FinTrackException;
import seedu.fintrack.utils.Storage;
import seedu.fintrack.utils.Ui;
import seedu.fintrack.Categories;

public class HelpCommand implements Command {
    @Override
    public void execute(ExpenseList expenseList, Ui ui, Storage storage, Categories categories)
            throws FinTrackException {
        ui.showMessage("\nDetailed Usage Instructions:");

        // Add Expense
        ui.showMessage(Ui.cyan + "1. Add Expense" + Ui.reset);
        ui.showMessage("   Step 1: Type 'add'");
        ui.showMessage("   Step 2: Press Enter");
        ui.showMessage("   Step 3: Type the expense details:");
        ui.showMessage("          <dollars>,<cents>,<category index>,<description>[,<date>[,<time>]]");
        ui.showMessage("          Example: 4,50,1,Chicken Rice,2025-03-28,15:30:00");
        ui.showMessage("          Example: 2,99,2,Coffee");
        ui.showMessage("          Example: 15,00,3,Dinner,2025-03-28");
        ui.showMessage("   Note: Date and time are optional. Current date/time will be used if not provided.");
        ui.printBorder();

        // View Month
        ui.showMessage(Ui.yellow + "2. View Month's Expenses" + Ui.reset);
        ui.showMessage("   Step 1: Type 'viewmonth'");
        ui.showMessage("   Step 2: Press Enter");
        ui.showMessage("   Example: Shows all expenses for the current month");
        ui.printBorder();

        // View History
        ui.showMessage(Ui.yellow + "3. View Spending History" + Ui.reset);
        ui.showMessage("   Step 1: Type 'history'");
        ui.showMessage("   Step 2: Press Enter");
        ui.showMessage("   Example: Shows all expenses in chronological order");
        ui.printBorder();

        // Update Expense
        ui.showMessage(Ui.purple + "4. Update Expense" + Ui.reset);
        ui.showMessage("   Step 1: Type 'update'");
        ui.showMessage("   Step 2: Press Enter");
        ui.showMessage("   Step 3: Select the expense number from the history");
        ui.showMessage("   Step 4: Type the new details:");
        ui.showMessage("          <dollars>,<cents>,<category index>,<description>[,<date>[,<time>]]");
        ui.showMessage("          Example: 4,50,1,Chicken Rice,2025-03-28,15:30:00");
        ui.showMessage("          Example: 3,00,2,Tea");
        ui.showMessage("          Example: 20,00,3,Lunch,2025-03-29");
        ui.printBorder();

        // Delete Expense
        ui.showMessage(Ui.red + "5. Delete Expense" + Ui.reset);
        ui.showMessage("   Step 1: Type 'delete'");
        ui.showMessage("   Step 2: Press Enter");
        ui.showMessage("   Step 3: Type the expense number to delete");
        ui.showMessage("   Example: Type '1' to delete the first expense in the list");
        ui.printBorder();


        // Add Recurring Expense
        ui.showMessage(Ui.blue + "6. Add Recurring Expense" + Ui.reset);
        ui.showMessage("   Step 1: Type 'recurring'");
        ui.showMessage("   Step 2: Press Enter");
        ui.showMessage("   Step 3: Type the recurring expense details:");
        ui.showMessage("          <dollars>,<cents>,<category index>,<description>,<frequency>");
        ui.showMessage("          Example: 10,00,3,Spotify,Monthly");
        ui.printBorder();

        // Update Recurring Expense
        ui.showMessage(Ui.cyan + "7. Update Recurring Expense" + Ui.reset);
        ui.showMessage("   Step 1: Type 'update recurring'");
        ui.showMessage("   Step 2: Press Enter");
        ui.showMessage("   Step 3: Select the recurring expense number");
        ui.showMessage("   Step 4: Type the new details");
        ui.printBorder();

        // View Recurring Expense
        ui.showMessage(Ui.yellow + "8. View Recurring Expenses" + Ui.reset);
        ui.showMessage("   Step 1: Type 'view recurring'");
        ui.showMessage("   Step 2: Press Enter");
        ui.showMessage("   Example: Shows all recurring expenses");
        ui.printBorder();

        // Delete Recurring Expense
        ui.showMessage(Ui.red + "9. Delete Recurring Expense" + Ui.reset);
        ui.showMessage("   Step 1: Type 'delete recurring'");
        ui.showMessage("   Step 2: Press Enter");
        ui.showMessage("   Step 3: Type the recurring expense number to delete");
        ui.printBorder();

        // Category Management
        ui.showMessage(Ui.green + "10. Create Category" + Ui.reset);
        ui.showMessage("   Step 1: Type 'category add'");
        ui.showMessage("   Step 2: Press Enter");
        ui.showMessage("   Step 3: Type the category name/names");
        ui.showMessage("   Example: Type 'Transport' or 'Transport,Healthcare'");
        ui.printBorder();

        // Delete Category
        ui.showMessage(Ui.red + "11. Delete Category" + Ui.reset);
        ui.showMessage("   Step 1: Type 'category del'");
        ui.showMessage("   Step 2: Press Enter");
        ui.showMessage("   Step 3: Type the category index/indexes");
        ui.showMessage("   Example: Type '3' or '1,2,3'");
        ui.printBorder();

        // Update Income
        ui.showMessage(Ui.cyan + "12. Update Income" + Ui.reset);
        ui.showMessage("   Step 1: Type 'update income'");
        ui.showMessage("   Step 2: Press Enter");
        ui.showMessage("   Step 3: Type the new income amount");
        ui.showMessage("   Example: Type '300000' for a $3000 monthly income");
        ui.printBorder();

        // Update Savings Goal
        ui.showMessage(Ui.cyan + "13. Update Savings Goal" + Ui.reset);
        ui.showMessage("   Step 1: Type 'update savings goal'");
        ui.showMessage("   Step 2: Press Enter");
        ui.showMessage("   Step 3: Type the new savings goal amount");
        ui.showMessage("   Example: Type '50000' for a $500 savings goal");
        ui.printBorder();

        // Clear History
        ui.showMessage(Ui.red + "14. Clear History" + Ui.reset);
        ui.showMessage("   Step 1: Type 'clear'");
        ui.showMessage("   Step 2: Press Enter");
        ui.showMessage("   Step 3: Type 'yes' to confirm");
        ui.showMessage("   Example: Type 'yes' to confirm deletion of all expenses");
        ui.printBorder();

        // Export
        ui.showMessage(Ui.cyan + "15. Export Expenses" + Ui.reset);
        ui.showMessage("   Step 1: Type 'export'");
        ui.showMessage("   Step 2: Press Enter");
        ui.showMessage("   Example: Type 'export' to save all expenses to a CSV file");
        ui.showMessage("   Note: The file will be saved in the 'exports' folder with the current date and time");
        ui.printBorder();

        //Tips
        ui.showMessage(Ui.cyan + "16. tips" + Ui.reset);
        ui.showMessage("   Step 1: Type 'Tips'");
        ui.showMessage("   Step 2: Press Enter");
        ui.printBorder();

        // Exit
        ui.showMessage(Ui.red + "17. Exit Program" + Ui.reset);
        ui.showMessage("   Step 1: Type 'exit'");
        ui.showMessage("   Step 2: Press Enter");
        ui.showMessage("   Example: Type 'exit' to close the program");
        ui.printBorder();
    }
}
