## Change log
----------------------

Version 5.10-SNAPSHOT
-------------

ADDED:

- new factory method for create a new File object from a string with the absolut path and a boolean
  flag if true to create an empty file

Version 5.9
-------------

ADDED:

- new method that can delete files recursively with a given prefix in a source directory
- new unit test classes for the class SystemFileExtensions and SystemPropertiesExtensions created
- new factory method for create new File with parent directory and filename in FileFactory class
- added java area in build.gradle for activate support of module path inference

CHANGED:

- update of silly-io dependency to new version 1.4
- update of throw-able dependency to new version 1.6
- update of commons-lang3 dependency to new version 3.12.0
- remove of unused silly-collections dependency
- update of zip4j dependency to new version 2.9.0
- update of com.github.ben-manes.versions.gradle.plugin to new version 0.39.0
- changed dependencies to the new group id io.github.astrapi69
- update gradle to new version 6.9
- changed to new package io.github.astrapi69
- update of jobj-compare dependency to new version 3.8
- update of silly-collections dependency to new version 8.7
- update of silly-io dependency to new version 1.3
- update of commons-io dependency to new version 2.10.0
- update of commons-lang3 dependency to new version 3.12.0
- update of zip4j dependency to new version 2.6.4
- update of test dependency testng to new version 7.4.0
- update of test dependency meanbean-factories to new version 1.3

Version 5.7
-------------

ADDED:

- new methods in class SystemFileExtensions for get the download directory as File object

CHANGED:

- update gradle to new version 6.5
- update of jobj-compare dependency to new version 3.6.1
- update of silly-collections dependency to new version 8.2
- update of checksum-up dependency to new version 1.1
- update of commons-io dependency to new version 2.7
- update of zip4j dependency to new version 2.6.1
- update of gradle plugin sonarqube to new version 3.0
- extracted project properties to gradle.properties

Version 5.6
-------------

ADDED:

- new class that provides most user environment variables like users home
- new class in test sources that can copy gradle config files after a migration from maven

CHANGED:

- update of jobj-compare dependency to new version 3.4
- update of silly-collections dependency to new version 8.1
- update of commons-lang3 dependency to new version 3.10
- update of test dependency testng to new version 7.2.0
- update of test dependency meanbean-factories to new version 1.2

Version 5.5
-------------

ADDED:

- new idea run configurations for gradle builds created
- created file gradle.properties
- new dependency jobj-compare in version 3.2 added
- new dependency throw-able in version 1.2 added
- new dependency checksum-up in version 1 added
- new test method for copy run configurations files from one source project to another target
  project and modifies its content

CHANGED:

- removed lombok dependency
- removed all lombok dependent imports
- removed idea run configurations for maven
- moved dependency versions to file gradle.properties
- update of silly-strings dependency version to 5.5
- update of silly-io dependency version to 1.2
- update of silly-collections dependency version to 8
- update of crypt-api dependency version to 7.3
- removed of mystic-crypt dependency
- removed of junit dependency
- removed of mockito-core dependency

Version 5.4
-------------

CHANGED:

- removed maven related files

Version 5.3
-------------

ADDED:

- new method created for modify a single file
- gradle as build system

CHANGED:

- changed project nature from maven to gradle nature
- update of parent version to 5
- update of silly-collections dependency version to 5.4
- update of test-objects dependency version to 5.2
- update of silly-strings dependency version to 5.3.1
- update of jobj-contract-verifier dependency version to 3.2
- moved ChecksumExtensions class to mystic-crypt project and tagged as deprecated

Version 5.2
-------------

ADDED:

- new methods created for create directory from a Path obejct
- new dependency commons-lang3 in version 3.9 added
- new dependency jobj-contract-verifier in version 3.1 added
- new dependency commons-io in version 2.6 added
- new dependency silly-io in version 1.1 added
- new dependency silly-strings in version 5.3 added

CHANGED:

- update of parent version to 4.8
- removed jcommons-lang dependency
- removed jobject-evaluate dependency
- update of silly-collections dependency version to 5.2
- update of test-objects dependency version to 5.1

Version 5.1
-------------

ADDED:

- new extension class for modify file content
- new BiFunction interface created for generic modify file content
- new unit tests for the new extension class for modify file content

CHANGED:

- moved interfaces for comparison from files or directories to appropriate api package

Version 5.0.2
-------------

CHANGED:

- update of jcommons-lang dependency version to 5.1.1

Version 5.0.1
-------------

CHANGED:

- update of parent version to 4.5
- update of silly-collections dependency version to 5
- update of jobject-extensions version to 2.5
- update of jcommons-lang dependency version to 5.1
- update of test-objects dependency version to 5
- update of jobject-evaluate dependency version to 2.5
- excluded logging dependencies

Version 5
-------------

ADDED:

- new method for get the checksum from a given byte arrays with a given algorithm

CHANGED:

- update of parent version to 4.2
- removed poi dependencies and corresponding classes
- update of silly-collections dependency version to 4.34.1
- update of mystic-crypt dependency version to 5.6

Version 4.23
-------------

CHANGED:

- update of parent version to 4.1
- update of jcommons-lang dependency version to 4.35
- update of silly-collections dependency version to 4.33
- update of mystic-crypt dependency version to 5.4
- update of jobject-extensions version to 1.12

Version 4.22
-------------

ADDED:

- new classes created and moved to them all methods that catches exceptions and handle them in a
  quietly manner

CHANGED:

- update of parent version to 3.12
- unit tests extended for improve code coverage
- removed deprecated methods, enums and classes
- update of silly-collections dependency version to 4.31

Version 4.21
-------------

ADDED:

- new dependency silly-collections in version 4.30.1

CHANGED:

- update of jcommons-lang dependency version from 4.33 to 4.34

Version 4.20
-------------

CHANGED:

- update of parent version to 3.11
- removed unneeded .0 at the end of version
- update of test-objects dependency version from 4.22.0 to 4.26
- update of jcommons-lang dependency version from 4.29.0 to 4.33
- javadoc improved
- tagged URLExtensions and Protocol classes as deprecated. Moved to net-extensions project

Version 4.19.0
-------------

ADDED:

- provide package.html for the javadoc of new packages
- Donation buttons extended for paypal and bitcoin
- added new meanbean dependency for better unit testing of beans

CHANGED:

- update of parent version and of dependencies versions
- javadoc extended and improved

Notable links:
[keep a changelog](http://keepachangelog.com/en/1.0.0/) Don’t let your friends dump git logs into
changelogs
