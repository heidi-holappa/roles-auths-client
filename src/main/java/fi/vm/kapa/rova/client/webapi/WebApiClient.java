/**
 * The MIT License
 * Copyright (c) 2016 Population Register Centre
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
package fi.vm.kapa.rova.client.webapi;

import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;

import java.io.IOException;

/**
 * Shared parent methods for HpaWebApiClient and YpaWebClient.
 */
public interface WebApiClient {
     //Initiates a session with webApi. Stores OAuth userid and sessionid for later requests.

    /**
     * Initiates a session with webApi. Stores OAuth userid and sessionid for later requests.
     * Return a URL for Rova WebApi selection screen. End user should be directed there for
     * principal selection.
     *
     * @param requestId
     * @param urlParams to attach to redirect url
     * @return URL for Rova WebApi selection screen.
     * @throws IOException
     */
    String register(String requestId, String urlParams) throws IOException;

    /**
     * Terminates a session with webApi.
     * Returns true for successful termination. E
     *
     * @return URL for Rova WebApi selection screen.
     * @throws IOException
     */
    Boolean unregister() throws IOException;


    /**
     * Get OAuth access token and store it in this client.
     *
     * @param code OAuth response code receiced by end user after selection
     * @param urlParams
     * @throws OAuthProblemException
     * @throws OAuthSystemException
     */
    void getToken(String code, String urlParams)
            throws OAuthProblemException, OAuthSystemException;

}
