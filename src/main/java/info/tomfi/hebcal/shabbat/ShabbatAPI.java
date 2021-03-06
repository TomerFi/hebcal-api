/*
 * Copyright Tomer Figenblat.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package info.tomfi.hebcal.shabbat;

import info.tomfi.hebcal.shabbat.request.Request;
import info.tomfi.hebcal.shabbat.response.Response;
import java.util.concurrent.CompletableFuture;

/**
 * Service abstraction used to contract service providers implementing HebCal's Shabbat REST API.
 */
public interface ShabbatAPI {
  /**
   * Send an asynchronous {@link Request} and recieve a {@link Response}.
   *
   * @param request the request to send to the API.
   * @return the response wrapped in a {@link CompletableFuture}.
   */
  CompletableFuture<Response> sendAsync(Request request);
}
