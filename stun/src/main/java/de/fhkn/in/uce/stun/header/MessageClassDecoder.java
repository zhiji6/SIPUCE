/*
    Copyright (c) 2012 Alexander Diener, 

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.fhkn.in.uce.stun.header;

/**
 * The {@link MessageClassDecoder} decodes the message class.
 * 
 * @author Alexander Diener (aldiener@htwg-konstanz.de)
 * 
 */
public interface MessageClassDecoder {
    /**
     * The method returns for a given encoding the corresponding message class.
     * 
     * @param encoded
     *            the encoded message class
     * @return the message class for the given encoding
     */
    MessageClass decode(int encoded);
}
