	package Player.Service;

public interface IPlaybackService {
    /*
    * IPlaybackService
    *
    * */

    /**
     * TODO: 이전 음악 재생
     */
    void prev();

    /**
     * TODO: 재생
     */
    void play();

    /**
     * TODO: 정지
     */
    void stop();


    /**
     * TODO: 다음 음악 재생
     */
    void next();

    /**
     * TODO: 진행도 설정 (드래그 액션 포함)
     * 진행도 100%인 경우 => next()
     */
    void setProgress();

    /**
     * TODO: 가사 토글
     */
    void lyrics();

    /**
     * TODO: 반복 토글
     */
    void repeat();

    /**
     * TODO: 셔플 토글
     */
    void shuffle();

    /**
     * TODO: 좋아요 토글
     */
    void like();

    /**
     * TODO: 앨범 정보 가져오기
     */
    void getAlbumInfo();
}
