/* 
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
 */
package org.ngrinder.script.repository;

import java.io.File;

import org.ngrinder.infra.annotation.TestOnlyComponent;
import org.ngrinder.model.User;
import org.ngrinder.script.repository.FileEntryRepository;

@TestOnlyComponent
public class MockFileEntityRepsotory extends FileEntryRepository {

	private File userRepoDir;

	@Override
	public File getUserRepoDirectory(User user) {
		return userRepoDir;
	}

	public void setUserRepository(File userRepository) {
		this.userRepoDir = userRepository;
	}
}