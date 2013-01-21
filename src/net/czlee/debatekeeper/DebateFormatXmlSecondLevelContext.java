/*
 * Copyright (C) 2012 Chuan-Zheng Lee
 *
 * This file is part of the Debatekeeper app, which is licensed under the
 * GNU General Public Licence version 3 (GPLv3).  You can redistribute
 * and/or modify it under the terms of the GPLv3, and you must not use
 * this file except in compliance with the GPLv3.
 *
 * This app is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public Licence for more details.
 *
 * You should have received a copy of the GNU General Public Licence
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.czlee.debatekeeper;

/**
 * Enumerated constants for the second-level context of a debate format XML file.
 * Also provides an overridden <code>toString()</code> method.
 * @author Chuan-Zheng Lee
 * @since  2012-06-20
 */
public enum DebateFormatXmlSecondLevelContext {
    NONE ("no context"),
    INFO ("info"),
    RESOURCE ("resource"),
    PREP_TIME_CONTROLLED ("prep time (controlled)"),
    SPEECH_FORMAT ("speech format"),
    SPEECHES_LIST ("speeches list");

    private final String name;

    private DebateFormatXmlSecondLevelContext(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}