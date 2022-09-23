# Let's learn CSS Grid!

Clone this down to your local environment, and follow along. 

STEP 1 

/*Add this code to rad.css at the bottom where it says to style the grid  */

#grid {
  display: grid;
}

/* 
  Answer using comments
  - How many columns are in this "grid"?
  - How many rows?
  - How many items total are there?
  - How wide is the column? (We're going for answers like "100%" or "fullscreen")
  - How tall are the rows? (This is a good opportunity to look at the computed styles)
  */

/* add the following to the previous code*/
    #grid {
      display: grid;
      grid-gap: 8px;
      grid-template-columns: 250px auto 175px;
}

/* Predict
 - How many columns will there be?
 - How big will the first column be?
 - How big will the last column be?
 - How big will the middle column be?
 - How many rows will there be?
*/


STEP 2
CHALLENGE FOR ROWS
We've made a template for our columns. What do you think you'd do if you wanted to make a template for the rows too? Challenge yourself to do this by making the second row 250px, but the other rows just 100px.

STEP 3
CHALLENGE
Build each of the following:
   - a 6x2 grid
   - a 2x6 grid
   - a 3x4 grid where the second row is larger than the others

STEP 4

Reset the grid to the following:
#grid {
    display: grid;
    grid-gap: 8px;
    grid-template-columns: 1fr 2fr 1fr;
}

STEP 5
The coolest thing we can do is specifically size one cell to act differently from the other cells in the grid. For example, we can tell one item to be wider by spanning across multiple columns. Span is only one of several ways you can do this (you can also use gridlines as explicit start and stop values), but span is the most straightforward. Here is an example that makes the ruby div span across two columns (and therefore be twice as wide). 

#ruby {
  grid-column: span 2;
}

STEP 6

Challenge
  - Turn the Ruby into a full header. (make it span 3 columns)
  - Make the JavaScript div into a sidebar. (make it span several rows - 5 works)
  - Pick a div and make it span across the entire bottom like a footer.
  - Make another div span two rows and two columns.

QUESTIONS?
