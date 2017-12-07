package com.bnkk.padc.proof.of.concept.screen.implementation.events;

import com.bnkk.padc.proof.of.concept.screen.implementation.data.vo.MovieVO;

import java.util.List;

/**
 * Created by E5-575G on 12/7/2017.
 */

public class RestApiEvents {

    public static class EmptyResponseEvent {
        // errors when response is empty
    }

    public static class ErrorInvokingAPIEvent {
        // errors when invoking API

        private String errorMsg;

        public ErrorInvokingAPIEvent(String errorMsg) {
            this.errorMsg = errorMsg;
        }

        public String getErrorMsg() {
            return errorMsg;
        }
    }

    public static class MovieDataLoadedEvent {
        // when data is loaded

        private int loadedPageIndex;
        private List<MovieVO> loadedMovies;

        public MovieDataLoadedEvent(int loadedPageIndex, List<MovieVO> loadedMovies) {
            this.loadedPageIndex = loadedPageIndex;
            this.loadedMovies = loadedMovies;
        }

        public int getLoadedPageIndex() {
            return loadedPageIndex;
        }

        public List<MovieVO> getLoadedMovies() {
            return loadedMovies;
        }
    }
}
