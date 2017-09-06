package behavioral.iterator.bookexample.social_networks;

import behavioral.iterator.bookexample.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator getFriendsIterator(String profileEmail);

    ProfileIterator getCoworkersIterator(String profileEmail);
}
