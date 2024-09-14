# Luca DalCanto Portfolio 2024 - 2025

## Complex Applications 4: Pandora's Box (Encrypted Journal)
This application can read and write from a file called "my_journal.txt". Before you can access the contents of the file, you must enter the "magic number" which acts as the key to encrypting and decrypting the text. For the exiting contents of "my_journal.txt" I have used a magic number of 42.

When you add a note to the journal, it gets encrypted before being written to the text file. The encryption is just:
- The characters of your input string get converted to their Unicode integer value
- The magic number is added to the Unicode integer value
- The new integers are converted back into characters
- Those characters are written to the file.

The inverse process takes place when reading from the file. Only when the "magic numbers" of both input and output are the same can you recover the original message.

<img src="https://github.com/Luca-Skyline/B8_Adv_Programming_Portfolio/blob/42a64495add7aa9be40888d907003683fa21b0d6/images/Pandora%20Home.png" width = 250>
<img src="https://github.com/Luca-Skyline/B8_Adv_Programming_Portfolio/blob/42a64495add7aa9be40888d907003683fa21b0d6/images/Pandora%20Intro.png" width = 250>

## Complex Applications 3: Magic the Gathering Database
With this application, users can keep track of the Magic cards in their collection. They can create cards with a name, quantity, multiple card types, rarity, and legendaryness. New cards are appended to an Arraylist. They can then view, edit, and delete cards, as well as filter and view their collection based on card type. This last feature is recursive so you can filter down to specific combinations such as "artifact creatures".

<img src="https://github.com/Luca-Skyline/B8_Adv_Programming_Portfolio/blob/3146ce35242ca16c83ee130689297760dfc3f6a9/images/MTGD_Home.png" width=350>
<img src="https://github.com/Luca-Skyline/B8_Adv_Programming_Portfolio/blob/7d3fd292bb0870b0f5ba0e2bd48a7bbb13213fc2/images/MTGD_New_Card.png" width=350>
