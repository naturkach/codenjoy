package com.codenjoy.dojo.expansion.model.levels;

/*-
 * #%L
 * Codenjoy - it's a dojo-like platform from developers to developers.
 * %%
 * Copyright (C) 2018 Codenjoy
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */


import com.codenjoy.dojo.utils.TestUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by oleksandr.baglai on 24.06.2016.
 */
public class LevelsTest {

    public static final int LEVEL_SIZE = 16;

    @Test
    public void testLevel1() {
        String map = getMap(Levels.SINGLE.get(0));
        asrtMap("                " +
                "                " +
                "                " +
                "                " +
                "                " +
                "                " +
                "     ╔════┐     " +
                "     ║1..E│     " +
                "     └────┘     " +
                "                " +
                "                " +
                "                " +
                "                " +
                "                " +
                "                " +
                "                ", map);
    }

    private String getMap(String level) {
        return Levels.resize(Levels.get(level), LEVEL_SIZE);
    }

    @Test
    public void testLevel5() {
        String map = getMap(Levels.SINGLE.get(4));
        asrtMap("                " +
                "                " +
                "                " +
                "                " +
                "    ╔══════┐    " +
                "    ║1.....│    " +
                "    ║..┌─╗.│    " +
                "    ║..│ ║.│    " +
                "    ║.$╚═╝.│    " +
                "    ║......│    " +
                "    ║..$..E│    " +
                "    └──────┘    " +
                "                " +
                "                " +
                "                " +
                "                ", map);
    }

    @Test
    public void testLevel6() {
        String map = getMap(Levels.SINGLE.get(5));
        asrtMap("                " +
                "                " +
                "                " +
                "                " +
                "    ╔══════┐    " +
                "    ║1.O..O│    " +
                "    ║....O.│    " +
                "    └──╗O..│    " +
                "       ║..O│    " +
                "    ╔══╝.O.│    " +
                "    ║E..O..│    " +
                "    └──────┘    " +
                "                " +
                "                " +
                "                " +
                "                ", map);
    }

    @Test
    public void testLevel7() {
        String map = getMap(Levels.SINGLE.get(6));
        asrtMap("                " +
                "                " +
                "  ╔══════┐      " +
                "  ║1...B.│      " +
                "  └─╗B...│      " +
                "    ║B..B│      " +
                "  ╔═╝$B..╚══┐   " +
                "  ║$....B..B│   " +
                "  ║.┌───╗B..│   " +
                "  ║.│   ║...│   " +
                "  ║.╚═══╝.B.│   " +
                "  ║.E.....B$│   " +
                "  └─────────┘   " +
                "                " +
                "                " +
                "                ", map);
    }

    @Test
    public void testDemoLevel() {
        String map = getMap(Levels.DEMO);
        asrtMap("                " +
                " ╔════════════┐ " +
                " ║1...O......2│ " +
                " ║......$O....│ " +
                " ║....┌──╗....│ " +
                " ║....│  ║....│ " +
                " ║.O┌─┘  └─╗.O│ " +
                " ║.$│      ║..│ " +
                " ║..│      ║$.│ " +
                " ║O.╚═┐  ╔═╝O.│ " +
                " ║....│  ║....│ " +
                " ║....╚══╝....│ " +
                " ║....O$......│ " +
                " ║4......O...3│ " +
                " └────────────┘ " +
                "                ", map);
    }

    @Test
    public void testLevel4() {
        String map = getMap(Levels.SINGLE.get(3));
        asrtMap("                " +
                "                " +
                "                " +
                "  ╔══════════┐  " +
                "  ║..........│  " +
                "  ║.┌──────╗.│  " +
                "  ║.│      ║.│  " +
                "  ║.│ ╔══┐ ║.│  " +
                "  ║.│ ║.1│ ║.│  " +
                "  ║.│ ║.┌┘ ║.│  " +
                "  ║.│ ║.│  ║.│  " +
                "  ║.│ ║.╚══╝.│  " +
                "  ║E│ ║......│  " +
                "  └─┘ └──────┘  " +
                "                " +
                "                ", map);
    }

    @Test
    public void testMultiLevel1() {
        String map = getMap(Levels.MULTI.get(0));
        asrtMap(" ╔═════┐    ╔═════┐ " +
                "╔╝.....╚┐  ╔╝.....╚┐" +
                "║.1.....│  ║.....2.│" +
                "║.......╚══╝.......│" +
                "║.....B............│" +
                "║.......B..B.......│" +
                "║.......B......B...│" +
                "└╗................┌┘" +
                " └─╗.B...OO..BB.┌─┘ " +
                "   ║....O$$O....│   " +
                "   ║....O$$O....│   " +
                " ╔═╝.BB..OO...B.╚═┐ " +
                "╔╝................╚┐" +
                "║...B......B.......│" +
                "║.......B..B.......│" +
                "║............B.....│" +
                "║.......┌──╗.......│" +
                "║.4.....│  ║.....3.│" +
                "└╗.....┌┘  └╗.....┌┘" +
                " └─────┘    └─────┘ ", map);
    }

    @Test
    public void testMultiLevel2() {
        String map = getMap(Levels.MULTI.get(1));
        asrtMap(" ╔════════════════┐ " +
                "╔╝$$$$........$$$$╚┐" +
                "║$$$$..........$$$$│" +
                "║$$$............$$$│" +
                "║$$..............$$│" +
                "║$................$│" +
                "║..................│" +
                "║..................│" +
                "║......1....2......│" +
                "║..................│" +
                "║..................│" +
                "║......4....3......│" +
                "║..................│" +
                "║..................│" +
                "║$................$│" +
                "║$$..............$$│" +
                "║$$$............$$$│" +
                "║$$$$..........$$$$│" +
                "└╗$$$$........$$$$┌┘" +
                " └────────────────┘ ", map);
    }

    @Test
    public void testMultiLevel3() {
        String map = getMap(Levels.MULTI.get(2));
        asrtMap("╔══════════════════┐" +
                "║O$O$O$O$O$O$O$O$O$│" +
                "║$O.O.O.O.O.O.O.O.O│" +
                "║O.....O.O.O.O.O.O$│" +
                "║$..1.......O.....O│" +
                "║O.....O.......2..$│" +
                "║$O...O.O.O.O.....O│" +
                "║O.O...O.O.O.O...O$│" +
                "║$O.....O.O.O.O...O│" +
                "║O...............O$│" +
                "║$O...............O│" +
                "║O.O...O.O.O.....O$│" +
                "║$O...O.O.O.O...O.O│" +
                "║O.....O.O.O.O...O$│" +
                "║$..4.......O.....O│" +
                "║O.....O.......3..$│" +
                "║$O.O.O.O.O.O.....O│" +
                "║O.O.O.O.O.O.O.O.O$│" +
                "║$O$O$O$O$O$O$O$O$O│" +
                "└──────────────────┘", map);
    }

    @Test
    public void testMultiLevel4() {
        String map = getMap(Levels.MULTI.get(3));
        asrtMap("╔══════┐    ╔══════┐" +
                "║B$....╚┐  ╔╝....$B│" +
                "║$......╚══╝......$│" +
                "║..1.....BB.....2..│" +
                "║.....B......B.....│" +
                "║....B..B..B..B....│" +
                "║...B..........B...│" +
                "└╗.....BB..BB.....┌┘" +
                " └╗..B.B┌──╗B.B..┌┘ " +
                "  ║B....│  ║....B│  " +
                "  ║B....│  ║....B│  " +
                " ╔╝..B.B╚══╝B.B..╚┐ " +
                "╔╝.....BB..BB.....╚┐" +
                "║...B..........B...│" +
                "║....B..B..B..B....│" +
                "║.....B......B.....│" +
                "║..4.....BB.....3..│" +
                "║$......┌──╗......$│" +
                "║B$....┌┘  └╗....$B│" +
                "└──────┘    └──────┘", map);
    }

    @Test
    public void testMultiLevel5() {
        String map = getMap(Levels.MULTI.get(4));
        asrtMap("╔══════════════════┐" +
                "║$......$..$......$│" +
                "║BBBBB........BBBBB│" +
                "║....BB......BB....│" +
                "║.1..B.B....B.B..2.│" +
                "║....BB.B..B.BB....│" +
                "║....B.BBBBBB.B....│" +
                "║....B.B....B.B....│" +
                "║..................│" +
                "║..................│" +
                "║..................│" +
                "║..................│" +
                "║....B.B....B.B....│" +
                "║....B.BBBBBB.B....│" +
                "║....BB.B..B.BB....│" +
                "║.4..B.B....B.B..3.│" +
                "║....BB......BB....│" +
                "║BBBBB........BBBBB│" +
                "║$......$..$......$│" +
                "└──────────────────┘", map);
    }

    @Test
    public void testMultiLevel6() {
        String map = getMap(Levels.MULTI.get(5));
        asrtMap("       ╔════┐       " +
                "     ╔═╝....╚═┐     " +
                "   ╔═╝........╚═┐   " +
                "  ╔╝............╚┐  " +
                "  ║......B.......│  " +
                " ╔╝......B.......╚┐ " +
                " ║.......B...2....│ " +
                "╔╝...1...BB.......╚┐" +
                "║.......$OB$.......│" +
                "║......BBOOOBBBB...│" +
                "║...BBBBOOOBB......│" +
                "║.......$BO$.......│" +
                "└╗.......BB...3...┌┘" +
                " ║....4...B.......│ " +
                " └╗.......B......┌┘ " +
                "  ║.......B......│  " +
                "  └╗............┌┘  " +
                "   └─╗........┌─┘   " +
                "     └─╗....┌─┘     " +
                "       └────┘       ", map);
    }

    @Test
    public void testBigMultiLevel1() {
        String map = getMap(Levels.BIG_MULTI1);
        asrtMap("                                      " +
                "   ╔════┐      ╔═════════┐            " +
                "   ║$...│      ║......$..│            " +
                "   ║BB.O│      ║.........│ ╔══════┐   " +
                "   ║B...│      ║...B.BBBB│ ║..O..O│   " +
                "   ║.4..│  ╔═══╝....$...O│ ║..$.BB│   " +
                "   ║....╚══╝......O......│ ║O.3.O.│   " +
                "   ║..$......┌─╗....$..OO│ ║O....B│   " +
                "   ║B...┌────┘ ║.O.......│ ║B.┌───┘   " +
                "   ║B..O│      ║.........╚═╝B.│       " +
                "   └╗.┌─┘ ╔════╝..BOO.........│       " +
                "    ║.│   ║..$..B.B....B.B..BB│       " +
                "    ║.│   ║$..┌─╗.B.┌─────╗B.B╚═┐     " +
                "    ║.│   ║...│ ║BB.│     ║O..BB│     " +
                "    ║.│   └───┘ ║...│     ║.$...│     " +
                "   ╔╝.╚═┐       ║.B.│  ╔══╝.....│     " +
                "   ║..B.│  ╔════╝.BB│  ║....BO.$│     " +
                "   ║...$│  ║B.......╚══╝.BB.B...│     " +
                "   ║O...╚══╝O...O...$....┌────╗.│     " +
                "   ║..O............O┌────┘    ║.╚═══┐ " +
                "   ║....┌──╗.OB.E...│       ╔═╝.B...│ " +
                "   ║BB..│  ║BBB.....│  ╔════╝.....$.│ " +
                "   └─╗.┌┘  ║...O..$O│  ║.......$....│ " +
                "     ║.│   └───╗.┌──┘  └────╗.......│ " +
                " ╔═══╝.╚═┐     ║.│          └───╗..O│ " +
                " ║..O....│  ╔══╝.╚════════┐     ║.O.│ " +
                " ║....O..│  ║......$..B.BB│     ║O..│ " +
                " ║$┌─────┘  ║.┌───╗.BB..BB╚═════╝.┌─┘ " +
                " ║.│        ║.│   ║....O..........│   " +
                " ║.│ ╔══════╝.╚┐  ║┌─╗....┌───╗.B┌┘   " +
                " ║.│ ║.........╚══╝│ └─╗.┌┘   ║..│    " +
                " ║.│ ║B.O....O..$..│   ║.│    ║B.╚══┐ " +
                " ║.╚═╝..O.$....┌─╗.╚═══╝.╚══┐ ║.$...│ " +
                " ║.$.2..O..O.BB│ ║.BB....O..│ ║.....│ " +
                " ║.┌───╗BB.BBBB│ ║.....$....│ ║..1..│ " +
                " ║.│   ║.$.....│ └──╗.BO..OB│ ║.....│ " +
                " └─┘   ║...$...│    └───────┘ ║...B.│ " +
                "       └───────┘              └─────┘ ", map);
    }

    private void asrtMap(String expected, String actual) {
        assertEquals(TestUtils.injectN(expected),
                TestUtils.injectN(actual));
    }

    @Test
    public void testResizeLevel_increase() {
        String input =
                "                " +
                " ############## " +
                " #S...O.......# " +
                " #......$O....# " +
                " #....####....# " +
                " #....#  #....# " +
                " #.O###  ###.O# " +
                " #.$#      #..# " +
                " #..#      #$.# " +
                " #O.###  ###O.# " +
                " #....#  #....# " +
                " #....####....# " +
                " #....O$......# " +
                " #.......O...E# " +
                " ############## " +
                "                ";

        String resized = Levels.resize(input, 20);

        asrtMap("                    " +
                "                    " +
                "                    " +
                "   ##############   " +
                "   #S...O.......#   " +
                "   #......$O....#   " +
                "   #....####....#   " +
                "   #....#  #....#   " +
                "   #.O###  ###.O#   " +
                "   #.$#      #..#   " +
                "   #..#      #$.#   " +
                "   #O.###  ###O.#   " +
                "   #....#  #....#   " +
                "   #....####....#   " +
                "   #....O$......#   " +
                "   #.......O...E#   " +
                "   ##############   " +
                "                    " +
                "                    " +
                "                    ", resized);
    }

    @Test
    public void testResizeLevel_increaseNonOdd() {
        String input =
                "                " +
                " ############## " +
                " #S...O.......# " +
                " #......$O....# " +
                " #....####....# " +
                " #....#  #....# " +
                " #.O###  ###.O# " +
                " #.$#      #..# " +
                " #..#      #$.# " +
                " #O.###  ###O.# " +
                " #....#  #....# " +
                " #....####....# " +
                " #....O$......# " +
                " #.......O...E# " +
                " ############## " +
                "                ";

        String resized = Levels.resize(input, 17);

        asrtMap("                 " +
                " ##############  " +
                " #S...O.......#  " +
                " #......$O....#  " +
                " #....####....#  " +
                " #....#  #....#  " +
                " #.O###  ###.O#  " +
                " #.$#      #..#  " +
                " #..#      #$.#  " +
                " #O.###  ###O.#  " +
                " #....#  #....#  " +
                " #....####....#  " +
                " #....O$......#  " +
                " #.......O...E#  " +
                " ##############  " +
                "                 " +
                "                 ", resized);
    }

    @Test
    public void testResizeLevel_sameLength() {
        String input =
                "                " +
                " ############## " +
                " #S...O.......# " +
                " #......$O....# " +
                " #....####....# " +
                " #....#  #....# " +
                " #.O###  ###.O# " +
                " #.$#      #..# " +
                " #..#      #$.# " +
                " #O.###  ###O.# " +
                " #....#  #....# " +
                " #....####....# " +
                " #....O$......# " +
                " #.......O...E# " +
                " ############## " +
                "                ";

        String resized = Levels.resize(input, 16);

        asrtMap("                " +
                " ############## " +
                " #S...O.......# " +
                " #......$O....# " +
                " #....####....# " +
                " #....#  #....# " +
                " #.O###  ###.O# " +
                " #.$#      #..# " +
                " #..#      #$.# " +
                " #O.###  ###O.# " +
                " #....#  #....# " +
                " #....####....# " +
                " #....O$......# " +
                " #.......O...E# " +
                " ############## " +
                "                ", resized);
    }

    @Test
    public void testResizeLevel_lessThanNeeded() {
        String input =
                "                " +
                " ############## " +
                " #S...O.......# " +
                " #......$O....# " +
                " #....####....# " +
                " #....#  #....# " +
                " #.O###  ###.O# " +
                " #.$#      #..# " +
                " #..#      #$.# " +
                " #O.###  ###O.# " +
                " #....#  #....# " +
                " #....####....# " +
                " #....O$......# " +
                " #.......O...E# " +
                " ############## " +
                "                ";

        String resized = Levels.resize(input, 10);

        asrtMap("                " +
                " ############## " +
                " #S...O.......# " +
                " #......$O....# " +
                " #....####....# " +
                " #....#  #....# " +
                " #.O###  ###.O# " +
                " #.$#      #..# " +
                " #..#      #$.# " +
                " #O.###  ###O.# " +
                " #....#  #....# " +
                " #....####....# " +
                " #....O$......# " +
                " #.......O...E# " +
                " ############## " +
                "                ", resized);
    }

    @Test
    public void shouldLoadFromFile() {
        String s = Levels.loadFromFile(Levels.DEMO);
        assertEquals(
                "##############" +
                "#1...O......2#" +
                "#......$O....#" +
                "#....####....#" +
                "#....#  #....#" +
                "#.O###  ###.O#" +
                "#.$#      #..#" +
                "#..#      #$.#" +
                "#O.###  ###O.#" +
                "#....#  #....#" +
                "#....####....#" +
                "#....O$......#" +
                "#4......O...3#" +
                "##############", s);
    }
}
