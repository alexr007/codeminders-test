package org.alexr.kata13;

import org.alexr.kata13.count.CountNonBlank;
import org.alexr.kata13.counter.StripAndCount;
import org.alexr.kata13.strip.Strip5Wisely;

import java.io.File;

public class Configuration {

  public StripAndCount counter() {
    return new StripAndCount(
//        new Strip1Nothing(),
//        new CountAll()                // 61

//        new Strip1Nothing(),
//        new CountNonBlank()           // 52 = 61 - 9 blank

//        new Strip2LineOnlyComments(),
//        new CountNonBlank()  // 45 = 52 - 7 single lines

//        new Strip3BlockOnlyComments(),
//        new CountNonBlank() // 46 = 52 - 6 block

//        new Strip4AllComments(),
//        new CountNonBlank()       // 39 = 52 - 6 - 7

        new Strip5Wisely(),
        new CountNonBlank()       // 39 = 52 - 6 - 7, // 6 not 5
    );
  }

  public boolean fileFilter(File fl) {
    return fl.isFile()
        && fl.toString().toLowerCase().endsWith(".java");
  }

}
