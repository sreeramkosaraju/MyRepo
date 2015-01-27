# MyRepo
The Sprial Matrix program print the mXn matrix in a spiral order.

The logic I used is a non recursive one.
The idea is to keep track the 4 indexes(top, down, left and right).
The top and left are initialized to 0 and the right and down and the number of columns and rows respectively.

The program starts printing the matrix from the top left and moves to the right and increments the top index so that the row
is never read again.
In the second loop, we print the right most contents in the matrix and decement the down index.

Similarly we print the contents from bottom right to left and bottom left to top.
The program exits when the top index is greater than down or when the left is greater than right.

The time complexity of this algorithm is O(n2).
