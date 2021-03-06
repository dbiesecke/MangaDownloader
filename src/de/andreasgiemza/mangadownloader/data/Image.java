/*
 * The MIT License
 *
 * Copyright 2015 Andreas Giemza <andreas@giemza.net>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package de.andreasgiemza.mangadownloader.data;

/**
 *
 * @author Andreas Giemza <andreas@giemza.net>
 */
public class Image {

    private final String link;
    private final String linkFragment;
    private final String referrer;
    private final String extension;

    public Image(String link, String referrer, String extension) {
        this.link = link;
        this.referrer = referrer;
        this.extension = extension;
        this.linkFragment = null;
    }

    public Image(String link, String referrer, String extension, String linkFragment) {
        this.link = link;
        this.referrer = referrer;
        this.extension = extension;
        this.linkFragment = linkFragment;
    }

    public String getLink() {
        return link;
    }

    public String getLinkFragment() {
        return linkFragment;
    }

    public String getReferrer() {
        return referrer;
    }

    public String getExtension() {
        return extension;
    }
}
