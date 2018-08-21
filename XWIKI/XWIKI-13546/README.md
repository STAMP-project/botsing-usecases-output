Analysis
========

* JIRA issue: https://jira.xwiki.org/browse/XWIKI-13546
* EvoCrash was able to nicely reproduce the error with a generated test that's easy to read.
* However the problem fro the stack trace is very easy to figure out. It just takes a few seconds to find out that we get the error because the wiki id is not set in the context (i.e. that `this.wikiManager.getCurrentWikiId()` returns null)
* EvoCrash doesn't provide any information about the root cause though. The root cause is that the wikiid is not passed in the mail item put on the prepare queue and it's not set as the current wiki during the mail sending.
* So even though EvoCrash did a nice job, it's not very useful.
* You can check the real code fix at https://github.com/xwiki/xwiki-platform/commit/a181fb0d142daeee34c785dcf5e2c416bef19c17#diff-3e850cd36f4f01f1a005b59040b25e11R186
