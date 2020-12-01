package com.codenjoy.dojo.icancode.services;

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


import com.codenjoy.dojo.client.Encoding;
import com.codenjoy.dojo.icancode.services.levels.*;
import com.codenjoy.dojo.utils.TestUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by oleksandr.baglai on 24.06.2016.
 */
public class LevelsTest {
    @Test
    public void testLevel1() {
        String map = getMap(new Level1().map());

        asrtMap("                " +
                "                " +
                "                " +
                "                " +
                "                " +
                "                " +
                "     ######     " +
                "     #S..E#     " +
                "     ######     " +
                "                " +
                "                " +
                "                " +
                "                " +
                "                " +
                "                " +
                "                ", map);

        String decorate = Levels.decorate(map);

        asrtMap("                " +
                "                " +
                "                " +
                "                " +
                "                " +
                "                " +
                "     ╔════┐     " +
                "     ║S..E│     " +
                "     └────┘     " +
                "                " +
                "                " +
                "                " +
                "                " +
                "                " +
                "                " +
                "                ", decorate);
    }

    private String getMap(String level) {
        return Levels.resize(Encoding.removeN(level), Levels.VIEW_SIZE_TESTING);
    }

    @Test
    public void testLevelB3() {
        String map = getMap(new LevelB3().map());

        asrtMap("                " +
                "                " +
                "                " +
                "                " +
                "    ########    " +
                "    #S...$.#    " +
                "    #..###.#    " +
                "    #..# #.#    " +
                "    #.$###$#    " +
                "    #......#    " +
                "    #$.$..E#    " +
                "    ########    " +
                "                " +
                "                " +
                "                " +
                "                ", map);

        String decorate = Levels.decorate(map);

        asrtMap("                " +
                "                " +
                "                " +
                "                " +
                "    ╔══════┐    " +
                "    ║S...$.│    " +
                "    ║..┌─╗.│    " +
                "    ║..│ ║.│    " +
                "    ║.$╚═╝$│    " +
                "    ║......│    " +
                "    ║$.$..E│    " +
                "    └──────┘    " +
                "                " +
                "                " +
                "                " +
                "                ", decorate);
    }

    @Test
    public void testLevelB4() {
        String map = getMap(new LevelB4().map());

        asrtMap("                " +
                "   ###          " +
                "   #E#########  " +
                "   #...$$$...#  " +
                "   #########.#  " +
                "           #$#  " +
                "   #########.#  " +
                "   #....S....#  " +
                "   #.#########  " +
                "   #$#          " +
                "   #.#########  " +
                "   #...$$$...#  " +
                "   #########E#  " +
                "           ###  " +
                "                " +
                "                ", map);

        String decorate = Levels.decorate(map);

        asrtMap("                " +
                "   ╔═┐          " +
                "   ║E╚═══════┐  " +
                "   ║...$$$...│  " +
                "   └───────╗.│  " +
                "           ║$│  " +
                "   ╔═══════╝.│  " +
                "   ║....S....│  " +
                "   ║.┌───────┘  " +
                "   ║$│          " +
                "   ║.╚═══════┐  " +
                "   ║...$$$...│  " +
                "   └───────╗E│  " +
                "           └─┘  " +
                "                " +
                "                ", decorate);
    }

    @Test
    public void testLevelC1() {
        String map = getMap(new LevelC1().map());

        asrtMap("                " +
                "                " +
                "                " +
                "                " +
                "    ########    " +
                "    #S.O..$#    " +
                "    #......#    " +
                "    ####...#    " +
                "       #..O#    " +
                "    ####...#    " +
                "    #...O.E#    " +
                "    ########    " +
                "                " +
                "                " +
                "                " +
                "                ", map);

        String decorate = Levels.decorate(map);

        asrtMap("                " +
                "                " +
                "                " +
                "                " +
                "    ╔══════┐    " +
                "    ║S.O..$│    " +
                "    ║......│    " +
                "    └──╗...│    " +
                "       ║..O│    " +
                "    ╔══╝...│    " +
                "    ║...O.E│    " +
                "    └──────┘    " +
                "                " +
                "                " +
                "                " +
                "                ", decorate);
    }

    @Test
    public void testLevelC2() {
        String map = getMap(new LevelC2().map());

        asrtMap("                " +
                "                " +
                "    #######     " +
                "    #S.O..#     " +
                "    ####..#     " +
                "       #..#     " +
                "    ####..###   " +
                "    #$B.OO..#   " +
                "    #.###...#   " +
                "    #.# #...#   " +
                "    #.###..E#   " +
                "    #.......#   " +
                "    #########   " +
                "                " +
                "                " +
                "                ", map);

        String decorate = Levels.decorate(map);

        asrtMap("                " +
                "                " +
                "    ╔═════┐     " +
                "    ║S.O..│     " +
                "    └──╗..│     " +
                "       ║..│     " +
                "    ╔══╝..╚═┐   " +
                "    ║$B.OO..│   " +
                "    ║.┌─╗...│   " +
                "    ║.│ ║...│   " +
                "    ║.╚═╝..E│   " +
                "    ║.......│   " +
                "    └───────┘   " +
                "                " +
                "                " +
                "                ", decorate);
    }

    @Test
    public void testLevelD1() {
        String map = getMap(new LevelD1().map());

        asrtMap("                " +
                "                " +
                "    ########    " +
                "    #S...B.#    " +
                "    ###B...#    " +
                "      #B...#    " +
                "    ###$B..#### " +
                "    #$....B..B# " +
                "    #.#####...# " +
                "    #.#   #...# " +
                "    #.#####.B.# " +
                "    #.E.....B$# " +
                "    ########### " +
                "                " +
                "                " +
                "                ", map);

        String decorate = Levels.decorate(map);

        asrtMap("                " +
                "                " +
                "    ╔══════┐    " +
                "    ║S...B.│    " +
                "    └─╗B...│    " +
                "      ║B...│    " +
                "    ╔═╝$B..╚══┐ " +
                "    ║$....B..B│ " +
                "    ║.┌───╗...│ " +
                "    ║.│   ║...│ " +
                "    ║.╚═══╝.B.│ " +
                "    ║.E.....B$│ " +
                "    └─────────┘ " +
                "                " +
                "                " +
                "                ", decorate);
    }

    @Test
    public void testLevelE1() {
        String map = getMap(new LevelE1().map());

        asrtMap("                " +
                "  #####         " +
                "  #S..#         " +
                "  #..B#######   " +
                "  #B..B˃...$#   " +
                "  ###....BBB#   " +
                "    #.B....$#   " +
                "    #...˄B..### " +
                "    #.###˃....# " +
                "    #.# #B.B.$# " +
                "    #.# #...### " +
                "    #.# #.$##   " +
                "    #E# ####    " +
                "    ###         " +
                "                " +
                "                ", map);

        String decorate = Levels.decorate(map);

        asrtMap("                " +
                "  ╔═══┐         " +
                "  ║S..│         " +
                "  ║..B╚═════┐   " +
                "  ║B..B˃...$│   " +
                "  └─╗....BBB│   " +
                "    ║.B....$│   " +
                "    ║...˄B..╚═┐ " +
                "    ║.┌─╗˃....│ " +
                "    ║.│ ║B.B.$│ " +
                "    ║.│ ║...┌─┘ " +
                "    ║.│ ║.$┌┘   " +
                "    ║E│ └──┘    " +
                "    └─┘         " +
                "                " +
                "                ", decorate);
    }

    @Test
    public void testLevelF1() {
        String map = getMap(new LevelF1().map());

        asrtMap("                " +
                "  ##### ####### " +
                "  #S..# #....Z# " +
                "  #...###...### " +
                "  #...$...$.#   " +
                "  ###.......#   " +
                "    #..$....#   " +
                "    #.....$.### " +
                "    #.###....E# " +
                "    #$# #.$...# " +
                "    #.###...### " +
                "    #...$..##   " +
                "    #.######    " +
                "    ###         " +
                "                " +
                "                ", map);

        String decorate = Levels.decorate(map);

        asrtMap("                " +
                "  ╔═══┐ ╔═════┐ " +
                "  ║S..│ ║....Z│ " +
                "  ║...╚═╝...┌─┘ " +
                "  ║...$...$.│   " +
                "  └─╗.......│   " +
                "    ║..$....│   " +
                "    ║.....$.╚═┐ " +
                "    ║.┌─╗....E│ " +
                "    ║$│ ║.$...│ " +
                "    ║.╚═╝...┌─┘ " +
                "    ║...$..┌┘   " +
                "    ║.┌────┘    " +
                "    └─┘         " +
                "                " +
                "                ", decorate);
    }

    @Test
    public void testLevelF2() {
        String map = getMap(new LevelF2().map());

        asrtMap("                " +
                "                " +
                "                " +
                "  ############  " +
                "  #S.........#  " +
                "  ##########.#  " +
                "           #.#  " +
                "  ##########.#  " +
                "  #....Z.....#  " +
                "  #.##########  " +
                "  #.#           " +
                "  #.##########  " +
                "  #.........E#  " +
                "  ############  " +
                "                " +
                "                ", map);

        String decorate = Levels.decorate(map);

        asrtMap("                " +
                "                " +
                "                " +
                "  ╔══════════┐  " +
                "  ║S.........│  " +
                "  └────────╗.│  " +
                "           ║.│  " +
                "  ╔════════╝.│  " +
                "  ║....Z.....│  " +
                "  ║.┌────────┘  " +
                "  ║.│           " +
                "  ║.╚════════┐  " +
                "  ║.........E│  " +
                "  └──────────┘  " +
                "                " +
                "                ", decorate);
    }

    @Test
    public void testLevelF3() {
        String map = getMap(new LevelF3().map());

        asrtMap("    ############### " +
                "    #Z.....E...$.Z# " +
                "    #B...O###B....# " +
                "  ###.B.B.# #.....# " +
                "  #.$.....# #B.$..# " +
                "  #...B#### ##..O.# " +
                "  #.O..#     ###..# " +
                "  #..$.#####   #.O# " +
                "  #BB......#####..# " +
                "  ######˃.........# " +
                "       ##....###### " +
                " #####  #.O..#      " +
                " #.$.#  #.$.B###### " +
                " #...####.......O.# " +
                " #....O...####B...# " +
                " ####..$..#  ###### " +
                "    #...O.#         " +
                " ####....B########  " +
                " #S...O$........S#  " +
                " #################  ", map);

        String decorate = Levels.decorate(map);

        asrtMap("    ╔═════════════┐ " +
                "    ║Z.....E...$.Z│ " +
                "    ║B...O┌─╗B....│ " +
                "  ╔═╝.B.B.│ ║.....│ " +
                "  ║.$.....│ ║B.$..│ " +
                "  ║...B┌──┘ └╗..O.│ " +
                "  ║.O..│     └─╗..│ " +
                "  ║..$.╚═══┐   ║.O│ " +
                "  ║BB......╚═══╝..│ " +
                "  └────╗˃.........│ " +
                "       └╗....┌────┘ " +
                " ╔═══┐  ║.O..│      " +
                " ║.$.│  ║.$.B╚════┐ " +
                " ║...╚══╝.......O.│ " +
                " ║....O...┌──╗B...│ " +
                " └──╗..$..│  └────┘ " +
                "    ║...O.│         " +
                " ╔══╝....B╚══════┐  " +
                " ║S...O$........S│  " +
                " └───────────────┘  ", decorate);
    }

    @Test
    public void testLevelG1() {
        String map = getMap(new LevelG1().map());

        asrtMap("  ############  ############# " +
                "  #..OB..$.BB#  #...B..B.O..# " +
                "  #.####..O..####.###...$...# " +
                "###.#  #B.....$...# #.####B.# " +
                "#.$.#  ###..B..O..# #O#  #..# " +
                "#.###    #.$.E....###.## #BB# " +
                "#O#      #.......B..$..# #..# " +
                "#.###    #B...O###B...$# #.$# " +
                "#.$$#  ###.B.B.# #.....# #B$# " +
                "#####  #.$.....# #B.$..# #..# " +
                "       #...B#### ##..O.# #.B# " +
                " #######.O..#     ###..# #..# " +
                " #$...B...$.#####   #.O# #..# " +
                " #..####BB......#####..# #.O# " +
                " #OB#  ######...$......# #..# " +
                " #..#       ##....###### #B.# " +
                " #$$# #####  #.O..#      #$$# " +
                " #..# #.$.#  #.$.B###### #.$# " +
                " #BB# #...####.......O.# #..# " +
                " #..# #....O...####B..## #### " +
                " #.O# ####..$..#  #####       " +
                " #..#    #$..O.#        ##### " +
                " #$$# ####....B######## #$$.# " +
                " #### #....O$...O...$.# #...# " +
                "      #.#####..######## ###B# " +
                "   ####$#   #..#          #.# " +
                "   #..O.#   #..#####  #####.# " +
                "####.####   #.O....####..$..# " +
                "#S...#      #...$..B.....#### " +
                "######      ##############    ", map);

        String decorate = Levels.decorate(map);

        asrtMap("  ╔══════════┐  ╔═══════════┐ " +
                "  ║..OB..$.BB│  ║...B..B.O..│ " +
                "  ║.┌──╗..O..╚══╝.┌─╗...$...│ " +
                "╔═╝.│  ║B.....$...│ ║.┌──╗B.│ " +
                "║.$.│  └─╗..B..O..│ ║O│  ║..│ " +
                "║.┌─┘    ║.$.E....╚═╝.╚┐ ║BB│ " +
                "║O│      ║.......B..$..│ ║..│ " +
                "║.╚═┐    ║B...O┌─╗B...$│ ║.$│ " +
                "║.$$│  ╔═╝.B.B.│ ║.....│ ║B$│ " +
                "└───┘  ║.$.....│ ║B.$..│ ║..│ " +
                "       ║...B┌──┘ └╗..O.│ ║.B│ " +
                " ╔═════╝.O..│     └─╗..│ ║..│ " +
                " ║$...B...$.╚═══┐   ║.O│ ║..│ " +
                " ║..┌──╗BB......╚═══╝..│ ║.O│ " +
                " ║OB│  └────╗...$......│ ║..│ " +
                " ║..│       └╗....┌────┘ ║B.│ " +
                " ║$$│ ╔═══┐  ║.O..│      ║$$│ " +
                " ║..│ ║.$.│  ║.$.B╚════┐ ║.$│ " +
                " ║BB│ ║...╚══╝.......O.│ ║..│ " +
                " ║..│ ║....O...┌──╗B..┌┘ └──┘ " +
                " ║.O│ └──╗..$..│  └───┘       " +
                " ║..│    ║$..O.│        ╔═══┐ " +
                " ║$$│ ╔══╝....B╚══════┐ ║$$.│ " +
                " └──┘ ║....O$...O...$.│ ║...│ " +
                "      ║.┌───╗..┌──────┘ └─╗B│ " +
                "   ╔══╝$│   ║..│          ║.│ " +
                "   ║..O.│   ║..╚═══┐  ╔═══╝.│ " +
                "╔══╝.┌──┘   ║.O....╚══╝..$..│ " +
                "║S...│      ║...$..B.....┌──┘ " +
                "└────┘      └────────────┘    ", decorate);
    }

    @Test
    public void testDemoLevel() {
        String map = getMap(Levels.DEMO_LEVEL);

        asrtMap("                " +
                " ############## " +
                " #S...O.....˅.# " +
                " #˃.....$O....# " +
                " #....####....# " +
                " #....#  #....# " +
                " #.O###  ###.O# " +
                " #.$#      #..# " +
                " #..#      #$.# " +
                " #O.###  ###O.# " +
                " #....#  #....# " +
                " #....####....# " +
                " #....O$.....˂# " +
                " #.˄.....O...E# " +
                " ############## " +
                "                ", map);

        String decorate = Levels.decorate(map);

        asrtMap("                " +
                " ╔════════════┐ " +
                " ║S...O.....˅.│ " +
                " ║˃.....$O....│ " +
                " ║....┌──╗....│ " +
                " ║....│  ║....│ " +
                " ║.O┌─┘  └─╗.O│ " +
                " ║.$│      ║..│ " +
                " ║..│      ║$.│ " +
                " ║O.╚═┐  ╔═╝O.│ " +
                " ║....│  ║....│ " +
                " ║....╚══╝....│ " +
                " ║....O$.....˂│ " +
                " ║.˄.....O...E│ " +
                " └────────────┘ " +
                "                ", decorate);
    }

    @Test
    public void testLevel9() {
        String map = getMap(new Level9().map());

        asrtMap("                " +
                "                " +
                "                " +
                "  ############  " +
                "  #..........#  " +
                "  #.########.#  " +
                "  #.#      #.#  " +
                "  #.# #### #.#  " +
                "  #.# #.S# #.#  " +
                "  #.# #.## #.#  " +
                "  #.# #.#  #.#  " +
                "  #.# #.####.#  " +
                "  #E# #......#  " +
                "  ### ########  " +
                "                " +
                "                ", map);

        String decorate = Levels.decorate(map);

        asrtMap("                " +
                "                " +
                "                " +
                "  ╔══════════┐  " +
                "  ║..........│  " +
                "  ║.┌──────╗.│  " +
                "  ║.│      ║.│  " +
                "  ║.│ ╔══┐ ║.│  " +
                "  ║.│ ║.S│ ║.│  " +
                "  ║.│ ║.┌┘ ║.│  " +
                "  ║.│ ║.│  ║.│  " +
                "  ║.│ ║.╚══╝.│  " +
                "  ║E│ ║......│  " +
                "  └─┘ └──────┘  " +
                "                " +
                "                ", decorate);
    }

    @Test
    public void testMultiLevel() {
        String map = getMap(new LevelZ().map());

        asrtMap("                                      " +
                "   ######      ###########            " +
                "   #$..˅#      #˃.....$..#            " +
                "   #BB.O#      #....Z....# ########   " +
                "   #B...#      #...B.BBBB# #˃.O..O#   " +
                "   #..S.#  #####˃...$...O# #..$.BB#   " +
                "   #˃...####......O..S...# #O.S.O˂#   " +
                "   #..$......###....$..OO# #O....B#   " +
                "   #B...###### #.O.......# #B.#####   " +
                "   #B..O#      #.........###B.#       " +
                "   ##.### ######..BOO.........#       " +
                "    #.#   #..$..B.B....B.B..BB#       " +
                "    #.#   #$..###.B.#######B.B###     " +
                "    #.#   #...# #BB.#     #O..BB#     " +
                "    #.#   ##### #...#     #.$..˂#     " +
                "   ##.###       #.B.#  ####.Z...#     " +
                "   #..B.#  ######.BB#  #....BO.$#     " +
                "   #...$#  #B.......####.BB.B...#     " +
                "   #O.Z.####O...O...$....######.#     " +
                "   #..O............O######    #.##### " +
                "   #˄...####.OB.....#       ###.B...# " +
                "   #BB..#  #BBB....˄#  ######˃....$.# " +
                "   ###.##  #˃..O..$O#  #˃......$.Z..# " +
                "     #.#   #####.####  ######˃......# " +
                " #####.###     #.#          #####..O# " +
                " #..O...˂#  ####.##########     #.O.# " +
                " #....O..#  #......$..B.BB#     #O..# " +
                " #$#######  #.#####.BB..BB#######.### " +
                " #.#        #.#   #....O....Z.....#   " +
                " #.# ########.##  ####....#####.B##   " +
                " #.# #.....˂...##### ###.##   #..#    " +
                " #.# #B.O....O..$..#   #.#    #B.#### " +
                " #.###..O.$E...###.#####.#### #.$...# " +
                " #.$....O.ZO.BB# #.BB˃...O..# #....˂# " +
                " #.#####BB.BBBB# #.....$E...# #.BE..# " +
                " #˄#   #.$....˂# ####.BO..OB# #˃....# " +
                " ###   #...$...#    ######### #...B.# " +
                "       #########              ####### ", map);

        String decorate = Levels.decorate(map);

        asrtMap("                                      " +
                "   ╔════┐      ╔═════════┐            " +
                "   ║$..˅│      ║˃.....$..│            " +
                "   ║BB.O│      ║....Z....│ ╔══════┐   " +
                "   ║B...│      ║...B.BBBB│ ║˃.O..O│   " +
                "   ║..S.│  ╔═══╝˃...$...O│ ║..$.BB│   " +
                "   ║˃...╚══╝......O..S...│ ║O.S.O˂│   " +
                "   ║..$......┌─╗....$..OO│ ║O....B│   " +
                "   ║B...┌────┘ ║.O.......│ ║B.┌───┘   " +
                "   ║B..O│      ║.........╚═╝B.│       " +
                "   └╗.┌─┘ ╔════╝..BOO.........│       " +
                "    ║.│   ║..$..B.B....B.B..BB│       " +
                "    ║.│   ║$..┌─╗.B.┌─────╗B.B╚═┐     " +
                "    ║.│   ║...│ ║BB.│     ║O..BB│     " +
                "    ║.│   └───┘ ║...│     ║.$..˂│     " +
                "   ╔╝.╚═┐       ║.B.│  ╔══╝.Z...│     " +
                "   ║..B.│  ╔════╝.BB│  ║....BO.$│     " +
                "   ║...$│  ║B.......╚══╝.BB.B...│     " +
                "   ║O.Z.╚══╝O...O...$....┌────╗.│     " +
                "   ║..O............O┌────┘    ║.╚═══┐ " +
                "   ║˄...┌──╗.OB.....│       ╔═╝.B...│ " +
                "   ║BB..│  ║BBB....˄│  ╔════╝˃....$.│ " +
                "   └─╗.┌┘  ║˃..O..$O│  ║˃......$.Z..│ " +
                "     ║.│   └───╗.┌──┘  └────╗˃......│ " +
                " ╔═══╝.╚═┐     ║.│          └───╗..O│ " +
                " ║..O...˂│  ╔══╝.╚════════┐     ║.O.│ " +
                " ║....O..│  ║......$..B.BB│     ║O..│ " +
                " ║$┌─────┘  ║.┌───╗.BB..BB╚═════╝.┌─┘ " +
                " ║.│        ║.│   ║....O....Z.....│   " +
                " ║.│ ╔══════╝.╚┐  ║┌─╗....┌───╗.B┌┘   " +
                " ║.│ ║.....˂...╚══╝│ └─╗.┌┘   ║..│    " +
                " ║.│ ║B.O....O..$..│   ║.│    ║B.╚══┐ " +
                " ║.╚═╝..O.$E...┌─╗.╚═══╝.╚══┐ ║.$...│ " +
                " ║.$....O.ZO.BB│ ║.BB˃...O..│ ║....˂│ " +
                " ║.┌───╗BB.BBBB│ ║.....$E...│ ║.BE..│ " +
                " ║˄│   ║.$....˂│ └──╗.BO..OB│ ║˃....│ " +
                " └─┘   ║...$...│    └───────┘ ║...B.│ " +
                "       └───────┘              └─────┘ ", decorate);
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
                " #S...O.....˅.# " +
                " #˃.....$O....# " +
                " #....####....# " +
                " #....#  #....# " +
                " #.O###  ###.O# " +
                " #.$#      #..# " +
                " #..#      #$.# " +
                " #O.###  ###O.# " +
                " #....#  #....# " +
                " #....####....# " +
                " #....O$.....˂# " +
                " #.˄.....O...E# " +
                " ############## " +
                "                ";

        String resized = Levels.resize(input, 20);

        asrtMap("                    " +
                "                    " +
                "                    " +
                "   ##############   " +
                "   #S...O.....˅.#   " +
                "   #˃.....$O....#   " +
                "   #....####....#   " +
                "   #....#  #....#   " +
                "   #.O###  ###.O#   " +
                "   #.$#      #..#   " +
                "   #..#      #$.#   " +
                "   #O.###  ###O.#   " +
                "   #....#  #....#   " +
                "   #....####....#   " +
                "   #....O$.....˂#   " +
                "   #.˄.....O...E#   " +
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
                " #S...O.....˅.# " +
                " #˃.....$O....# " +
                " #....####....# " +
                " #....#  #....# " +
                " #.O###  ###.O# " +
                " #.$#      #..# " +
                " #..#      #$.# " +
                " #O.###  ###O.# " +
                " #....#  #....# " +
                " #....####....# " +
                " #....O$.....˂# " +
                " #.˄.....O...E# " +
                " ############## " +
                "                ";

        String resized = Levels.resize(input, 17);

        asrtMap("                 " +
                " ##############  " +
                " #S...O.....˅.#  " +
                " #˃.....$O....#  " +
                " #....####....#  " +
                " #....#  #....#  " +
                " #.O###  ###.O#  " +
                " #.$#      #..#  " +
                " #..#      #$.#  " +
                " #O.###  ###O.#  " +
                " #....#  #....#  " +
                " #....####....#  " +
                " #....O$.....˂#  " +
                " #.˄.....O...E#  " +
                " ##############  " +
                "                 " +
                "                 ", resized);
    }

    @Test
    public void testResizeLevel_sameLength() {
        String input =
                "                " +
                " ############## " +
                " #S...O.....˅.# " +
                " #˃.....$O....# " +
                " #....####....# " +
                " #....#  #....# " +
                " #.O###  ###.O# " +
                " #.$#      #..# " +
                " #..#      #$.# " +
                " #O.###  ###O.# " +
                " #....#  #....# " +
                " #....####....# " +
                " #....O$.....˂# " +
                " #.˄.....O...E# " +
                " ############## " +
                "                ";

        String resized = Levels.resize(input, 16);

        asrtMap("                " +
                " ############## " +
                " #S...O.....˅.# " +
                " #˃.....$O....# " +
                " #....####....# " +
                " #....#  #....# " +
                " #.O###  ###.O# " +
                " #.$#      #..# " +
                " #..#      #$.# " +
                " #O.###  ###O.# " +
                " #....#  #....# " +
                " #....####....# " +
                " #....O$.....˂# " +
                " #.˄.....O...E# " +
                " ############## " +
                "                ", resized);
    }

    @Test
    public void testResizeLevel_lessThanNeeded() {
        String input =
                "                " +
                " ############## " +
                " #S...O.....˅.# " +
                " #˃.....$O....# " +
                " #....####....# " +
                " #....#  #....# " +
                " #.O###  ###.O# " +
                " #.$#      #..# " +
                " #..#      #$.# " +
                " #O.###  ###O.# " +
                " #....#  #....# " +
                " #....####....# " +
                " #....O$.....˂# " +
                " #.˄.....O...E# " +
                " ############## " +
                "                ";

        String resized = Levels.resize(input, 10);

        asrtMap("                " +
                " ############## " +
                " #S...O.....˅.# " +
                " #˃.....$O....# " +
                " #....####....# " +
                " #....#  #....# " +
                " #.O###  ###.O# " +
                " #.$#      #..# " +
                " #..#      #$.# " +
                " #O.###  ###O.# " +
                " #....#  #....# " +
                " #....####....# " +
                " #....O$.....˂# " +
                " #.˄.....O...E# " +
                " ############## " +
                "                ", resized);
    }
}
