package com.SortAndSearch;
import com.Searcher.*;
import com.Sorter.*;
import javax.swing.JOptionPane;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input =  JOptionPane.showInputDialog("Please enter unordered numbers seperated by commas"); 
String[] inputArray = input.split(",");
int[] array = new int [inputArray.length];
for (int i = 0; i < inputArray.length; i++) {
	array[i] = Integer.parseInt(inputArray[i]);
}

int sorted[] = Sorter.sort(array);
String output = "";
for(int i : sorted) {
	output += i;
}
JOptionPane.showMessageDialog(null,"The numbers you entered has been sorted as "+ output);

int search = Integer.parseInt(JOptionPane.showInputDialog("Enter a number to search from the input"));
int position = Searcher.search(sorted, search);
if(position != -1) {
	JOptionPane.showMessageDialog(null, "The number is at index " + position);	
}
else {
	JOptionPane.showMessageDialog(null, "The number was not found ");
}

	}

}
