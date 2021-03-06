package com.codenjoy.dojo.bomberman.model;

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


import com.codenjoy.dojo.bomberman.services.GameSettings;
import com.codenjoy.dojo.bomberman.services.Scores;
import com.codenjoy.dojo.services.EventListener;
import com.codenjoy.dojo.services.Point;
import com.codenjoy.dojo.services.round.RoundGamePlayer;

import java.util.Optional;

public class Player extends RoundGamePlayer<Hero, Field> {

    public Player(EventListener listener, GameSettings settings) {
        super(listener, settings);
    }

    @Override
    public void start(int round, Object startEvent) {
        super.start(round, startEvent);
        // hero.clearScores(); TODO test me
    }

    @Override
    public Hero createHero(Point pt) {
        // TODO либо везде сделать так (в чем я не уверен), либо тут сделать как везде
        Hero hero = settings().getHero(settings().getLevel());
        hero.move(pt);
        return hero;
    }

    @Override
    public void event(Object event) {
        getHero().addScore(Scores.scoreFor(settings(), event));
        super.event(event);
    }

    private GameSettings settings() {
        return (GameSettings) settings;
    }
}